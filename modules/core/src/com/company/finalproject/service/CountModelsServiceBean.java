package com.company.finalproject.service;

import com.company.finalproject.entity.AutoProducer;
import com.company.finalproject.entity.VehicleModel;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(CountModelsService.NAME)
public class CountModelsServiceBean implements CountModelsService {

    @Inject
    private DataManager dataManager;

    @Override
    public Integer modelsAmount(AutoProducer producer) {
        LoadContext<VehicleModel> ctx = LoadContext.create(VehicleModel.class)
                .setQuery(LoadContext.createQuery("select vm from finalproject$VehicleModel vm where vm.producer.name = :name")
                    .setParameter("name", producer.getName()))
                .setView("vehicleModel-view");
        List<VehicleModel> list = dataManager.loadList(ctx);
        return list.size();
    }
}