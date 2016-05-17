package com.prateep.model;

import javax.persistence.*;
import java.util.*;
import java.util.jar.Attributes;

/**
 * Created by prateep.gedupudi on 16-05-2016.
 */
@Entity
@Table(name = "USER_DETAIL")
public class UserDetail {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            name = "USER_DETAIL_ID"
    )
    private int id;
    @Column(
            name = "USER_DETAIL_USERNAME"
    )
    private String userName;
    @ManyToMany
    @JoinTable(
            name = "USER_DETAIL_VEHICLE",
            joinColumns = {
                    @JoinColumn(name = "USER_DETAIL_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "VEHICLE_ID")
            }

    )
    private Set<Vehicle> vehicles = new HashSet<Vehicle>();
    @ManyToMany
    @JoinTable(
            name = "USER_DETAIL_BOOK",
            joinColumns = {
                    @JoinColumn(name = "USER_DETAIL_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "BOOK_ID")
            }

    )
    private Set<Book> books = new HashSet<Book>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
