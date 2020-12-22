package com.food.dao;

import com.food.pojo.Category;
import com.food.pojo.CategoryExample;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CategoryMapper {

    //根据主键id删除
    int deleteByPrimaryKey(Integer id);

    //插入分类信息（全部）
    int insert(Category record);

    //插入分类信息（非空）
    int insertSelective(Category record);

    //查询所有符合example类条件的分类信息
    List<Category> selectByExample(CategoryExample example);

    //根据主键id查询
    Category selectByPrimaryKey(Integer id);

    //更新分类信息（非空）
    int updateByPrimaryKeySelective(Category record);

    //更新分类信息（全部）
    int updateByPrimaryKey(Category record);
}