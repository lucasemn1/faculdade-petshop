package com.AnormaisEBruna.petshop.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "provided_services")
public class ProvidedServiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String photoUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pets_id")
    private PetModel pet;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service_types_id")
    private ServiceType serviceType;

    public static ProvidedServiceModel newInstance(String name, String photoUrl, PetModel pet, ServiceType serviceType) {
        ProvidedServiceModel providedService = new ProvidedServiceModel();

        providedService.setName(name);
        providedService.setPhotoUrl(photoUrl);
        providedService.setPet(pet);
        providedService.setServiceType(serviceType);

        return providedService;
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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public PetModel getPet() {
        return pet;
    }

    public void setPet(PetModel pet) {
        this.pet = pet;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "ProvidedServiceModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", pet=" + pet +
                ", serviceType=" + serviceType +
                '}';
    }
}
