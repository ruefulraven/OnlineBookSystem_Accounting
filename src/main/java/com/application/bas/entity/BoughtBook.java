package com.application.bas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "book_sold")
@Getter @Setter
public class BoughtBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String bookName;
    Double price;
}
