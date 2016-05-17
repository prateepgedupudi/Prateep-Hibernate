package com.prateep.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by prateep.gedupudi on 16-05-2016.
 */
@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            name = "BOOK_ID"
    )
    private int id;
    @Column(
            name = "BOOK_NAME"
    )
    private String bookName;
    @ManyToMany(mappedBy = "books")
    private Set<UserDetail> checkedUsers = new HashSet<UserDetail>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Set<UserDetail> getCheckedUsers() {
        return checkedUsers;
    }

    public void setCheckedUsers(Set<UserDetail> checkedUsers) {
        this.checkedUsers = checkedUsers;
    }
}
