package com.company.finalproject.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|inn")
@Entity(name = "finalproject$LegalCustomer")
public class LegalCustomer extends Customer {
    private static final long serialVersionUID = -5779086150150932347L;

    @Column(name = "INN", unique = true, length = 20)
    protected String inn;

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }


}