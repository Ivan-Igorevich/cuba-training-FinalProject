package com.company.finalproject.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|name")
@Table(name = "FINALPROJECT_VEHICLE_MODEL")
@Entity(name = "finalproject$VehicleModel")
public class VehicleModel extends StandardEntity {
    private static final long serialVersionUID = 2032714519327713617L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 50)
    protected String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCER_ID")
    protected AutoProducer producer;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "vehicleModel")
    protected List<VehicleComplectation> complectation;

    public void setComplectation(List<VehicleComplectation> complectation) {
        this.complectation = complectation;
    }

    public List<VehicleComplectation> getComplectation() {
        return complectation;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProducer(AutoProducer producer) {
        this.producer = producer;
    }

    public AutoProducer getProducer() {
        return producer;
    }


}