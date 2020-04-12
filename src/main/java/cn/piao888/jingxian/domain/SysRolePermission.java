package cn.piao888.jingxian.domain;

public class SysRolePermission {
    private String id;

    private String sys_role_id;

    private String sys_permission_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSys_role_id() {
        return sys_role_id;
    }

    public void setSys_role_id(String sys_role_id) {
        this.sys_role_id = sys_role_id;
    }

    public String getSys_permission_id() {
        return sys_permission_id;
    }

    public void setSys_permission_id(String sys_permission_id) {
        this.sys_permission_id = sys_permission_id;
    }
}