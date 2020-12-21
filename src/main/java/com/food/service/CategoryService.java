package com.food.service;

import com.food.pojo.Category;

public interface CategoryService extends CrudService<Category> {
    /**
     * 更新分类
     * @param category
     */
    public void update(Category category);
}
