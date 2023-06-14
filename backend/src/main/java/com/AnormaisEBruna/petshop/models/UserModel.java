package com.AnormaisEBruna.petshop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@JsonIgnoreProperties({"clients"})
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    @JsonIgnore
    private String password;

    @OneToMany(mappedBy = "registeredBy", fetch = FetchType.EAGER)
    private List<ClientModel> clients;

    public static UserModel newInstance(String name, String email, String password) {
        UserModel user = new UserModel();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setClients(new ArrayList());

        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password  = password;
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

    public List<ClientModel> getClients() {
        return clients;
    }

    public void setClients(List<ClientModel> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
