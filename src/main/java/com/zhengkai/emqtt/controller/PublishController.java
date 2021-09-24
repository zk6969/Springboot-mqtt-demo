package com.zhengkai.emqtt.controller;


import com.zhengkai.emqtt.client.EmqttClient;
import com.zhengkai.emqtt.vo.PublishVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengkai
 * @title: PublishController
 * @projectName Springboot-mqtt-demo
 * @description: TODO
 * @date 2021/9/2417:00
 */
@RestController
@RequestMapping("/demo")
public class PublishController {

    @Autowired
    private EmqttClient emqttClient;

    @PostMapping("/publish/message")
    public String publishMqtt(@RequestBody PublishVo publishVo){
        if(publishVo != null && StringUtils.hasLength(publishVo.getData())) {
            if(!StringUtils.hasLength(publishVo.getTopic())){
                publishVo.setTopic("HelloWorld");
            }
            emqttClient.publishToMqtt(publishVo.getData(), publishVo.getTopic());
        }
        return "publish success";
    }


}