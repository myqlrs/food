package com.food.pojo;

import lombok.*;

/**
 * 传入商品id和url封装
 */
public class ProductVO {

    private int id;//商品id
    private String imageUrl;//图片保存url

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ProductVO{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
