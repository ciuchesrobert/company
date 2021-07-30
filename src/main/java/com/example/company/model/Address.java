package com.example.company.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="addresses")
@Data
@NoArgsConstructor

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street_number")
    private String streetNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;
}
