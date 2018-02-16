package com.company.finalproject.web.vehicle;

import com.company.finalproject.entity.VehicleModel;
import com.google.common.collect.ImmutableMap;
import com.haulmont.cuba.gui.components.*;
import com.company.finalproject.entity.Vehicle;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class VehicleEdit extends AbstractEditor<Vehicle> {

    @Named("fieldGroup.model")
    private PickerField modelField;

    @Named("fieldGroup.complectation")
    private PickerField complectationField;

    @Named("fieldGroup.producer")
    private PickerField producerField;

    @Named("fieldGroup.cost")
    private TextField costField;

    @Inject
    private Datasource<Vehicle> vehicleDs;

    @Override
    public void ready() {
        super.ready();
        if (getItem().getProducer() == null) modelField.setVisible(false);
        if (getItem().getModel() == null) complectationField.setVisible(false);
    }

    @Override
    protected void postInit() {
        super.postInit();
        producerField.getLookupAction().setAfterLookupCloseHandler((window, actionId) -> modelField.setVisible(true));
        modelField.getLookupAction().setAfterLookupCloseHandler((window, actionId) -> complectationField.setVisible(true));

        vehicleDs.addItemPropertyChangeListener(e -> {
            if ("producer". equals(e.getProperty())) {
                modelField.getLookupAction().setLookupScreenParams(ImmutableMap.of("producer", getItem().getProducer()));
                getItem().setModel(new VehicleModel());
                complectationField.setVisible(false);
            } else if ("model". equals(e.getProperty())) {
                complectationField.getLookupAction().setLookupScreenParams(ImmutableMap.of("model", getItem().getModel()));
                getItem().setComplectation(null);
            } else if ("complectation".equals(e.getProperty())) {
                if (getItem().getComplectation() != null)
                    getItem().setCost(getItem().getComplectation().getCost());
            }
        });

    }
}