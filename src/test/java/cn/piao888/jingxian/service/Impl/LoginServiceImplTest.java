package cn.piao888.jingxian.service.Impl;

import cn.piao888.jingxian.JingxianApplication;
import cn.piao888.jingxian.domain.SysUser;
import cn.piao888.jingxian.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {JingxianApplication.class})
@RunWith(SpringRunner.class)
public class LoginServiceImplTest {
    @Autowired
    private LoginService loginService;
    @Test
    public void getUserByName() {
        SysUser sysUser=loginService.getUserByName("bigrich.xu");
        System.out.println(sysUser.toString());
    }
}
