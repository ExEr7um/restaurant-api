package com.exer7um.restaurantapi.repositories;

import com.exer7um.restaurantapi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
