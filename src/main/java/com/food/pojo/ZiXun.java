package com.food.pojo;

import java.util.Date;

/**
 * 资讯信息
 */
public class ZiXun {
    private Integer id;//资讯id

    private String content;//资讯内容

    private Integer cstid;//用户id

    private Integer status;//审核状态（1：通过 0：未通过）

    private Date fabudate;//发布时间

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getCstid() {
        return cstid;
    }

    public void setCstid(Integer cstid) {
        this.cstid = cstid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getFabudate() {
        return fabudate;
    }

    public void setFabudate(Date fabudate) {
        this.fabudate = fabudate;
    }
}