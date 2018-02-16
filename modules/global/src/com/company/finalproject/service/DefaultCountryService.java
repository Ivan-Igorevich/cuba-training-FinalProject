package com.company.finalproject.service;


import com.company.finalproject.entity.Country;
import com.company.finalproject.entity.ExtUser;

public interface DefaultCountryService {
    String NAME = "finalproject_DefaultCountryService";

    Country getDefaultCountry(ExtUser user);
}