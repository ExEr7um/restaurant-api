package com.exer7um.restaurantapi.models;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "withId", types = Category.class)
public interface withId {
    Long getId();
    String getTitle();
    String getImage();
}
