package cn.piao888.jingxian.domain;

import cn.piao888.jingxian.domain.base.BaseEntity;

public class SysRole extends BaseEntity {
    private String id;

    private String name;

    private String available;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}