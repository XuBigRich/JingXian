package cn.piao888.jingxian.domain;

import java.util.Date;

public class SysRole {
    private Long role_id;

    private String role_name;

    private String role_key;

    private Integer role_sort;

    private String data_scope;

    private String status;

    private String del_flag;

    private String create_by;

    private Date create_time;

    private String update_by;

    private Date update_time;

    private String remark;

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_key() {
        return role_key;
    }

    public void setRole_key(String role_key) {
        this.role_key = role_key;
    }

    public Integer getRole_sort() {
        return role_sort;
    }

    public void setRole_sort(Integer role_sort) {
        this.role_sort = role_sort;
    }

    public String getData_scope() {
        return data_scope;
    }

    public void setData_scope(String data_scope) {
        this.data_scope = data_scope;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(String del_flag) {
        this.del_flag = del_flag;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}