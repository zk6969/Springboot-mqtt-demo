package com.zhengkai.emqtt.client;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;

/**
 * @author zhengkai
 * @title: EmqttClient
 * @projectName Springboot-mqtt-demo
 * @description: TODO
 * @date 2021/9/2417:02
 */
@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface EmqttClient {
    void publishToMqtt(String data, @Header(MqttHeaders.TOPIC)String topic);
}