package com.food.pojo;

/**
 * 给管理员赋予某个角色
 */
public class UserRole {
    private Long id;//管理员角色id

    private Long uid;//管理员id

    private Long rid;//角色id

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }
}