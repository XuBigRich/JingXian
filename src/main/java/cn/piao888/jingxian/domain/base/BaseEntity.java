package cn.piao888.jingxian.domain.base;

import java.util.Date;

/**
 * 所有实体类的基类
 * @Author： hongzhi.xu
 * @Date: 2020/8/1 3:35 下午
 * @Version 1.0
 */
public class BaseEntity {
    public Date createTime;
    public String createBy;
    public Date updateTime;
    public String updateBy;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
