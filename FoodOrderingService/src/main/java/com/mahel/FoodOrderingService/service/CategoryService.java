package com.mahel.FoodOrderingService.service;

import com.mahel.FoodOrderingService.model.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(String name, Long restaurantId);

    List<Category> findCategoryByRestaurantId(Long id) throws Exception;

    Category findCategoryById(Long id) throws Exception;

}
