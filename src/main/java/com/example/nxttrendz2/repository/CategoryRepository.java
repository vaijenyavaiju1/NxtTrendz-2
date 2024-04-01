package com.example.nxttrendz2.repository;

import java.util.*;
import com.example.nxttrendz2.model.Category;

public interface CategoryRepository {
    ArrayList<Category> getCategories();

    Category getCategoryById(int categoryId);

    Category addCategory(Category catgory);

    Category updateCategory(int categoryId, Category category);

    void deleteCategory(int categoryId);
}