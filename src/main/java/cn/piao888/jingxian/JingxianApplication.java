package cn.piao888.jingxian;

import org.mapstruct.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan(basePackages = {"cn.piao888.jingxian.mapper"})
public class JingxianApplication {

    public static void main(String[] args) {
        SpringApplication.run(JingxianApplication.class, args);
    }

}
