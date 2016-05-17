package com.prateep.model;

import javax.persistence.*;
import java.util.*;

/**
 * Created by prateep.gedupudi on 16-05-2016.
 */
@Entity
@Table(name = "VEHICLE")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            name = "VEHICLE_ID"
    )
    private int id;
    @Column(
            name = "VEHICLE_NAME"
    )
    private String name;

    @ManyToMany(mappedBy = "vehicles")
    private Set<UserDetail> users = new HashSet<UserDetail>();

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

    public Set<UserDetail> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDetail> users) {
        this.users = users;
    }
}
