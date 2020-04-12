package cn.piao888.jingxian.mapper;

import cn.piao888.jingxian.domain.SysUser;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface SysUserMapper {
    int insert(SysUser record);

    List<SysUser> selectAll();

    SysUser getUserByName(String username);

}
