package com.zhengkai.emqtt.vo;

/**
 * @author zhengkai
 * @title: PublishVo
 * @projectName Springboot-mqtt-demo
 * @description: TODO
 * @date 2021/9/2417:18
 */
public class PublishVo {


    private static final long serialVersionUID = -72561196618711073L;

    private String data;

    private String topic ;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
