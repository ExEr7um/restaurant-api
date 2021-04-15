package com.exer7um.restaurantapi.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Category extends BaseEntity {
    private String title;
    private String image;

    @OneToMany(mappedBy = "category")
    private List<MenuItem> menuItems;
}
