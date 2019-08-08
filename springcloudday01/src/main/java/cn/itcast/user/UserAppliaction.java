package cn.itcast.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Desc TODO
 * @Author wander_wum
 * @Date 2019/7/30
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("cn.itcast.user.dao")
@EnableDiscoveryClient
public class UserAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(UserAppliaction.class,args);

    }
}
