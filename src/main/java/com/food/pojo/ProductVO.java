package com.food.pojo;

import lombok.*;

/**
 * 传入商品id和url封装
 */
@Getter
@Setter
@ToString
public class ProductVO {

    private int id;
    private String imageUrl;

}
