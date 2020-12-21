package com.food.dao;

import com.food.pojo.ZiXun;
import com.food.pojo.ZiXunExample;
import java.util.List;

public interface ZiXunMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZiXun record);

    int insertSelective(ZiXun record);

    List<ZiXun> selectByExample(ZiXunExample example);

    ZiXun selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZiXun record);

    int updateByPrimaryKey(ZiXun record);

    /**
     * 资讯审核（通过）
     * @param zid
     */
    void shenhe(int zid);
}