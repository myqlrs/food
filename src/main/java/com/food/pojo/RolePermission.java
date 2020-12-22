package com.food.pojo;

/**
 * 给角色赋予某些权限
 */
public class RolePermission {
    private Long id;//角色权限id

    private Long rid;//角色id

    private Long pid;//权限id

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}