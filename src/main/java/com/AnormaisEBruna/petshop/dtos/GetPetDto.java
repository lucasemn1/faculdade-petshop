package com.AnormaisEBruna.petshop.dtos;

import com.AnormaisEBruna.petshop.models.ClientModel;
import com.AnormaisEBruna.petshop.models.ProvidedServiceModel;

import java.util.List;

public class GetPetDto {
    private Integer id;
    private String type;
    private String name;
    private String description;

    private List<ProvidedServiceModel> providedServices;
    private List<ClientModel> owners;

    public GetPetDto(
        Integer id,
        String type,
        String name,
        String description,
        List<ProvidedServiceModel> providedServices,
        List<ClientModel> owners
    ) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.providedServices = providedServices;
        this.owners = owners;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProvidedServiceModel> getProvidedServices() {
        return providedServices;
    }

    public void setProvidedServices(List<ProvidedServiceModel> providedServices) {
        this.providedServices = providedServices;
    }

    public List<ClientModel> getOwners() {
        return owners;
    }

    public void setOwners(List<ClientModel> owners) {
        this.owners = owners;
    }
}
