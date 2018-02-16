package com.company.finalproject.web.autoproducer;

import com.company.finalproject.entity.AutoProducer;
import com.company.finalproject.service.CountModelsService;
import com.haulmont.cuba.gui.components.*;

import javax.inject.Inject;
import java.util.Map;

public class AutoProducerBrowse extends AbstractLookup {
    @Inject
    private GroupTable<AutoProducer> autoProducersTable;

    @Inject
    private CountModelsService countModelsService;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
        autoProducersTable.addGeneratedColumn("modelsAmount", new Table.PrintableColumnGenerator<AutoProducer, String>() {
            @Override
            public String getValue(AutoProducer item) {
                return countModelsService.modelsAmount(item).toString();
            }

            @Override
            public Component generateCell(AutoProducer entity) {
                return new Table.PlainTextCell(countModelsService.modelsAmount(entity).toString());
            }
        });
    }
}