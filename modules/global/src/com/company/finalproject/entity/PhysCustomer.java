package com.company.finalproject.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|email")
@Entity(name = "finalproject$PhysCustomer")
public class PhysCustomer extends Customer {
    private static final long serialVersionUID = -134792603208905407L;

    @Column(name = "EMAIL", unique = true)
    protected String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}