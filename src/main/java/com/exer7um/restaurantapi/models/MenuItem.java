package com.exer7um.restaurantapi.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class MenuItem extends BaseEntity {
    private String title;
    private String image;
    private Integer price;
    private String ccal;
    private String ingredients;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
