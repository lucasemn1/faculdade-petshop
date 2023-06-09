package com.AnormaisEBruna.petshop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String cep;
    private String city;
    private String state;
    private int number;
    private String street;
    private String complement;

    public static AddressModel newInstance(String cep, String city, String state, int number, String street, String complement) {
        AddressModel address = new AddressModel();

        address.setCep(cep);
        address.setCity(city);
        address.setState(state);
        address.setNumber(number);
        address.setStreet(street);
        address.setComplement(complement);

        return address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    @Override
    public String toString() {
        return "AddressModel{" +
                "id=" + id +
                ", cep='" + cep + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", number=" + number +
                ", street='" + street + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }
}
