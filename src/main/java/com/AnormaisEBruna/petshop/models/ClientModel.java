package com.AnormaisEBruna.petshop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients")
@JsonIgnoreProperties({"address", "registeredBy", "pets"})
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "addresses_id", referencedColumnName = "id")
    private AddressModel address;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private UserModel registeredBy;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "clients_pets",
        joinColumns = @JoinColumn(name = "clients_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "pets_id", referencedColumnName = "id")
    )
    private List<PetModel> pets;

    public static ClientModel newInstance(
        String name,
        String email,
        String phoneNumber,
        AddressModel address,
        UserModel registeredBy
    ) {
        ClientModel client = new ClientModel();

        client.setName(name);
        client.setEmail(email);
        client.setPhoneNumber(phoneNumber);
        client.setAddress(address);
        client.setRegisteredBy(registeredBy);
        client.setPets(new ArrayList());

        return client;
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
        return "ClientModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", registeredBy=" + registeredBy +
                '}';
    }
}
