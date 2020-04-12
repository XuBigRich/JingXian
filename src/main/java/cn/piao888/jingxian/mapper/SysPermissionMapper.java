package cn.piao888.jingxian.mapper;

import cn.piao888.jingxian.domain.SysPermission;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface SysPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    SysPermission selectByPrimaryKey(Long id);

    List<SysPermission> selectAll();

    int updateByPrimaryKey(SysPermission record);
}
