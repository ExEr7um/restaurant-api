package com.exer7um.restaurantapi.repositories;

import com.exer7um.restaurantapi.models.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.Optional;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    @RestResource(path = "category", rel = "category")
    List<MenuItem> findByCategoryId(Long id);

    @RestResource(path = "title", rel = "title")
    Optional<MenuItem> findByTitle(String title);
}
