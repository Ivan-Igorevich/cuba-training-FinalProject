package com.company.finalproject.service;


import com.company.finalproject.entity.Country;
import com.haulmont.cuba.security.entity.User;

public interface DefaultCountryService {
    String NAME = "finalproject_DefaultCountryService";

    Country getDefaultCountry(User user);
}