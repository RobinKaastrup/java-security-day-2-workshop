package com.booleanuk.library.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "creator")
    private String creator;

    @Column
    private String type;

    @Column
    private String description;



    public Item(String title, String creator, String type, String description) {
        this.title = title;
        this.creator = creator;
        this.type = type;
        this.description = description;
    }

    public Item(int id) {
        this.id = id;
    }
}

