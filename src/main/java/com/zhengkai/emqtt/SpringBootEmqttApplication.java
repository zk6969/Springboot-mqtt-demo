package com.zhengkai.emqtt; /**
 * @author zhengkai
 * @title: SpringBootEmqttApplication
 * @projectName Springboot-mqtt-demo
 * @description: TODO
 * @date 2021/9/2417:40
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;

/**
 * {@link IntegrationComponentScan} 进行扫描 integ生命的注解并实现
 *
 */
@SpringBootApplication
@IntegrationComponentScan
public class SpringBootEmqttApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEmqttApplication.class, args);
    }
}
