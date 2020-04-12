package cn.piao888.jingxian.service.Impl;

import cn.piao888.jingxian.domain.SysRole;
import cn.piao888.jingxian.domain.SysUser;
import cn.piao888.jingxian.mapper.SysRoleMapper;
import cn.piao888.jingxian.mapper.SysUserMapper;
import cn.piao888.jingxian.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public SysUser getUserByName(String getMapByName) {
        //模拟数据库查询，正常情况此处是从数据库或者缓存查询。
        return getSysUser(getMapByName);
    }

    /**
     * 模拟数据库查询
     * @param userName
     * @return
     */
    private SysUser getSysUser(String userName){
        //根据用户名查出用户
        SysUser sysUser=sysUserMapper.getUserByName(userName);
        //根据用户id查出用户所属角色
        List<SysRole> roles=sysRoleMapper.selectRoleBelongByUserId(sysUser.getId());
        sysUser.setRoleList(roles);
        return sysUser;
    }
}
