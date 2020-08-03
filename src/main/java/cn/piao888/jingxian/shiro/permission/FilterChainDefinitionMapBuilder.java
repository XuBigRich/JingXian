package cn.piao888.jingxian.shiro.permission;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {
	public LinkedHashMap<String, String> builderFilterChainDefinitionMap() {
		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		map.put("/login","anon");
		map.put("/shiro/login","anon");
		map.put("/shiro/logout","logout");
		map.put("/admin","authc,roles[admin]");
		map.put("/user","authc,roles[user]");
		map.put("/**","authc");
		map.put("/user","anon");
		return map;
	}
	
	

}
