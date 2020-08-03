package cn.piao888.jingxian.controller;

import cn.piao888.jingxian.controller.base.BaseControler;
import cn.piao888.jingxian.vo.response.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static cn.piao888.jingxian.vo.response.Result.success;

/**
 * 登陆
 *
 * @Author： hongzhi.xu
 * @Date: 2020/8/1 11:56 上午
 * @Version 1.0
 */
@Controller

public class LoginController extends BaseControler {
    @GetMapping("/login")
    public Result login(String username, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        return success();
    }
}
