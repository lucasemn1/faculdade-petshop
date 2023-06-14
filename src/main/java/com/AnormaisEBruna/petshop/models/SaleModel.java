package com.AnormaisEBruna.petshop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "sales")
@JsonIgnoreProperties({"user"})
public class SaleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private float price;
    private String description;
    private long timestamp;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private UserModel user;

    public static SaleModel newInstance(float price, String description, UserModel user) {
        SaleModel saleModel = new SaleModel();

        saleModel.setPrice(price);
        saleModel.setDescription(description);
        saleModel.setUser(user);

        return saleModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "SaleModel{" +
                "id=" + id +
                ", price=" + price +
                ", timestamp=" + timestamp +
                ", user=" + user +
                '}';
    }
}
