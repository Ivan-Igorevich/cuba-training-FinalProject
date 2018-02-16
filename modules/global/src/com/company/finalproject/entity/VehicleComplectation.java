package com.company.finalproject.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|name")
@Table(name = "FINALPROJECT_VEHICLE_COMPLECTATION")
@Entity(name = "finalproject$VehicleComplectation")
public class VehicleComplectation extends StandardEntity {
    private static final long serialVersionUID = -2406178076627451060L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @NotNull
    @Column(name = "COST", nullable = false)
    protected BigDecimal cost;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    protected Integer type;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VEHICLE_MODEL_ID")
    protected VehicleModel vehicleModel;

    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setType(VehicleType type) {
        this.type = type == null ? null : type.getId();
    }

    public VehicleType getType() {
        return type == null ? null : VehicleType.fromId(type);
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }


}