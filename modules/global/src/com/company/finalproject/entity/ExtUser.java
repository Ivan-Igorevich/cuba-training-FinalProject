package com.company.finalproject.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Entity(name = "finalproject$ExtUser")
public class ExtUser extends User {
    private static final long serialVersionUID = -7775889231379261159L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEFAULT_COUNTRY_ID")
    protected Country defaultCountry;

    public void setDefaultCountry(Country defaultCountry) {
        this.defaultCountry = defaultCountry;
    }

    public Country getDefaultCountry() {
        return defaultCountry;
    }


}