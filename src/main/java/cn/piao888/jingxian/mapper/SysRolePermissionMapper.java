package cn.piao888.jingxian.mapper;

import cn.piao888.jingxian.domain.SysRolePermission;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(String id);

    List<SysRolePermission> selectAll();

    int updateByPrimaryKey(SysRolePermission record);
}
