package com.company.finalproject.entity;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NumberFormat;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "FINALPROJECT_VEHICLE")
@Entity(name = "finalproject$Vehicle")
public class Vehicle extends StandardEntity {
    private static final long serialVersionUID = -6851404104177255708L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCER_ID")
    protected AutoProducer producer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MODEL_ID")
    protected VehicleModel model;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPLECTATION_ID")
    protected VehicleComplectation complectation;

    @Column(name = "NAME", length = 500)
    protected String name;

    @NumberFormat(pattern = "####")
    @Column(name = "PROD_YEAR", length = 4)
    protected Integer prodYear;

    @Column(name = "COST")
    protected BigDecimal cost;

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }


    public void setProducer(AutoProducer producer) {
        this.producer = producer;
    }

    public AutoProducer getProducer() {
        return producer;
    }

    public void setModel(VehicleModel model) {
        this.model = model;
    }

    public VehicleModel getModel() {
        return model;
    }

    public void setComplectation(VehicleComplectation complectation) {
        this.complectation = complectation;
    }

    public VehicleComplectation getComplectation() {
        return complectation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProdYear(Integer prodYear) {
        this.prodYear = prodYear;
    }

    public Integer getProdYear() {
        return prodYear;
    }

    @MetaProperty
    public String getFullName() {
        String r = String.format("%s %s %s",
                producer == null ? " " : producer.getInstanceName(),
                model == null ? " " : model.getInstanceName(),
                complectation == null ? " " : complectation.getInstanceName());
        return r == null ? " " : r;
    }

}