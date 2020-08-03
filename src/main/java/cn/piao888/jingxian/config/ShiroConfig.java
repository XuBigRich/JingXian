package cn.piao888.jingxian.config;

import cn.piao888.jingxian.shiro.permission.FilterChainDefinitionMapBuilder;
import cn.piao888.jingxian.shiro.realm.ShiroRealm;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author： hongzhi.xu
 * @Date: 2020/8/1 10:36 上午
 * @Version 1.0
 */
@Configuration
public class ShiroConfig {
    /**
     * 加密方式的配置
     * @return 返回加密
     */
    @Bean
    public CredentialsMatcher credentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher=new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashIterations(1024);
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        return  hashedCredentialsMatcher;
    }

    /**
     * Realm 的配置
     * @param credentialsMatcher
     * @return
     */
    @Bean
    public ShiroRealm shiroRealm(CredentialsMatcher credentialsMatcher)
    {
        ShiroRealm shiroRealm = new ShiroRealm();
        shiroRealm.setCredentialsMatcher(credentialsMatcher);
        return shiroRealm;
    }

    /**
     * 安全驱动的配置
     * @param shiroRealm
     * @return
     */
    @Bean
    public SecurityManager securityManager(ShiroRealm shiroRealm)
    {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 设置realm.
        securityManager.setRealm(shiroRealm);
        return securityManager;
    }

    /**
     * 获取访问权限的工厂方法
     * @return
     */
    public Map filterChainDefinitionMap(){
        FilterChainDefinitionMapBuilder  filterChainDefinitionMapBuilder=new FilterChainDefinitionMapBuilder();
        return filterChainDefinitionMapBuilder.builderFilterChainDefinitionMap();
    }
    /**
     * 将安全驱动配置到web过滤器中的配置
     * @param securityManager
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap());
        return shiroFilterFactoryBean;
    }
}
