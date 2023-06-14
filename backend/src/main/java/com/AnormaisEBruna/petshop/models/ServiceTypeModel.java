package com.AnormaisEBruna.petshop.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "service_types")
@JsonIgnoreProperties({"providedServices"})
public class ServiceTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "serviceType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ProvidedServiceModel> providedServices;

    public static ServiceTypeModel newInstance(String name) {
        ServiceTypeModel serviceType = new ServiceTypeModel();

        serviceType.setName(name);
        serviceType.setProvidedServices(new ArrayList());

        return serviceType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProvidedServiceModel> getProvidedServices() {
        return providedServices;
    }

    public void setProvidedServices(List<ProvidedServiceModel> providedServices) {
        this.providedServices = providedServices;
    }

    @Override
    public String toString() {
        return "ServiceType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
