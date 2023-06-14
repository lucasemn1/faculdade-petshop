package com.AnormaisEBruna.petshop.dtos;

import com.AnormaisEBruna.petshop.models.AddressModel;
import com.AnormaisEBruna.petshop.models.PetModel;
import com.AnormaisEBruna.petshop.models.UserModel;

import java.util.List;

public class GetClientDto {
    public int id;
    public String name;
    public String email;
    public String phoneNumber;
    public AddressModel address;
    public UserModel registeredBy;
    public List<PetModel> pets;

    public GetClientDto(
        int id,
        String name,
        String email,
        String phoneNumber,
        AddressModel address,
        UserModel registeredBy,
        List<PetModel> pets
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.registeredBy = registeredBy;
        this.pets = pets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public UserModel getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(UserModel registeredBy) {
        this.registeredBy = registeredBy;
    }

    public List<PetModel> getPets() {
        return pets;
    }

    public void setPets(List<PetModel> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "GetClientDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", registeredBy=" + registeredBy +
                ", pets=" + pets +
                '}';
    }
}
