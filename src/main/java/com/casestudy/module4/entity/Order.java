package com.casestudy.module4.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name="orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean status;
    private boolean method;
    private int quality;
    private String date;

    @ManyToOne
    @JoinColumn(name="color_Id", nullable = true)
    Color color;

    @ManyToOne
    @JoinColumn(name="size_Id", nullable = true)
    Size size;

    @ManyToOne
    @JoinColumn(name="address_Id")
    Address address;

    @ManyToOne
    @JoinColumn(name="product_Id")
    Product product;

    public Order(String name, boolean status, boolean method, int quality, String date, Color color, Size size,
                 Address address, Product product) {
        super();
        this.name = name;
        this.status = status;
        this.method = method;
        this.quality = quality;
        this.date = date;
        this.color = color;
        this.size = size;
        this.address = address;
        this.product = product;
    }
}