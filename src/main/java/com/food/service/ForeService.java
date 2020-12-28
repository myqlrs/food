package com.food.service;

import com.food.pojo.Category;
import com.food.pojo.Product;

import java.util.List;

public interface ForeService {

    /**
     * 返回保存6个分类对象的List集合
     * @return
     */
    public List<Category> listToSix();

    /**
     * 随机获取5件商品
     * @return
     */
    public List<Product> getFivePro();
}
