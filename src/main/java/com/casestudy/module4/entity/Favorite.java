package com.casestudy.module4.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="favorites")
public class Favorite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String date;

    @ManyToOne
    @JoinColumn(name="user_Id")
    User user;

    @ManyToOne
    @JoinColumn(name="product_Id")
    Product product;

    public Favorite(String date, User user, Product product) {
        super();
        this.date = date;
        this.user = user;
        this.product = product;
    }


}

