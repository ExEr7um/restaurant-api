package com.exer7um.restaurantapi.repositories;

import com.exer7um.restaurantapi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @RestResource(path = "title", rel = "title")
    Optional<Category> findByTitle(String title);
}
