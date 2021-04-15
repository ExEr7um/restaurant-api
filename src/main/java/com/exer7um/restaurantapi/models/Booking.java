package com.exer7um.restaurantapi.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Booking extends BaseEntity {
    private String name;
    private String date;
    private Integer persons;
}
