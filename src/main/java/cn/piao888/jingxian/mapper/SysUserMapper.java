package cn.piao888.jingxian.mapper;

import cn.piao888.jingxian.domain.SysUser;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(String id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
    SysUser  getUserByName(String username);
}
