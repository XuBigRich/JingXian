package cn.piao888.jingxian.mapper;

import cn.piao888.jingxian.domain.SysRole;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface SysRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(String id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);
    List<SysRole> selectRoleBelongByUserId(String userId);
}
