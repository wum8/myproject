package cn.itcast.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Desc TODO
 * @Author wander_wum
 * @Date 2019/7/31
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer//声明这个应用是eureka服务
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class,args);
    }
}
