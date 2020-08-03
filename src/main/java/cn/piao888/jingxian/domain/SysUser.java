package cn.piao888.jingxian.domain;

import cn.piao888.jingxian.domain.base.BaseEntity;

import java.util.List;

public class SysUser extends BaseEntity {
    private String id;

    private String usercode;

    private String username;

    private String salt;
    /*账号是否被禁用*/
    private String locked;

    private List<SysRole> roleList;

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id='" + id + '\'' +
                ", usercode='" + usercode + '\'' +
                ", username='" + username + '\'' +
                ", salt='" + salt + '\'' +
                ", locked='" + locked + '\'' +
                ", roleList=" + roleList +
                '}';
    }
}
