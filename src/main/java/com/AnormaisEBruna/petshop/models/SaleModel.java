package com.AnormaisEBruna.petshop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "sales")
public class SaleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private float price;
    private long timestamp;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private UserModel user;

    public static SaleModel newInstance(float price, UserModel user) {
        SaleModel saleModel = new SaleModel();

        saleModel.setPrice(price);
        saleModel.setUser(user);

        return saleModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
