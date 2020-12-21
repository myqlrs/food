package com.food.service.Impl;

import com.food.dao.CategoryMapper;
import com.food.dao.ProductMapper;
import com.food.pojo.*;
import com.food.service.ForeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeServiceImpl implements ForeService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Category> listToThree() {
        CategoryExample example = new CategoryExample();
        example.createCriteria().andIdBetween(1,6); //从1开始计数
        List<Category> categories = categoryMapper.selectByExample(example);
        return categories;
    }

    @Override
    public List<Product> getFivePro() {
        return productMapper.randFive();
    }


}
