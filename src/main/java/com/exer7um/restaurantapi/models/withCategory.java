package com.exer7um.restaurantapi.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Calendar;

@Projection(name = "withCategory", types = MenuItem.class)
public interface withCategory {
    Long getId();
    Calendar getCreationDate();
    String getTitle();
    String getImage();
    Integer getPrice();
    String getCcal();
    String getIngredients();
    
    @Value("#{target?.category?.title}")
    String getCategory();
}
