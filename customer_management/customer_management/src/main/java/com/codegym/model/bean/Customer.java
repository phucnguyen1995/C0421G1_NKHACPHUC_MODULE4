package com.codegym.model.bean;

import javax.persistence.*;

//@Entity(name = "customer")
//@Table

@Table
@Entity(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String address;
    private String orderCustomer;

    public Customer() {
    }

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Customer( String name, String email, String address, String order) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.orderCustomer = order;
    }

    public Customer(Integer id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Customer(Integer id, String name, String email, String address, String order) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.orderCustomer = order;
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

    public String getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(String orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
