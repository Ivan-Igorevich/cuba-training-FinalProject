package com.company.finalproject.service;


import com.company.finalproject.entity.AutoProducer;

public interface CountModelsService {
    String NAME = "finalproject_CountModelsService";

    Integer modelsAmount(AutoProducer producer);
}