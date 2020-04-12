package cn.piao888.jingxian.mapper;

import cn.piao888.jingxian.domain.SysRole;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long role_id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Long role_id);

    List<SysRole> selectAll();

    List<SysRole> selectRoleBelongByUserId(String userId);

    int updateByPrimaryKey(SysRole record);
}
