package cn.piao888.jingxian.mapper;

import cn.piao888.jingxian.domain.SysUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

@Mapper
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(@Param("user_id") Long user_id, @Param("role_id") Long role_id);

    int insert(SysUserRole record);

    List<SysUserRole> selectAll();
}
