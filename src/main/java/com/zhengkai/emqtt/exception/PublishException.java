package com.zhengkai.emqtt.exception;

/**
 * @author zhengkai
 * @title: PushException
 * @projectName Springboot-mqtt-demo
 * @description: TODO
 * @date 2021/9/2416:59
 */
public class PublishException extends RuntimeException {
    public PublishException(String message) {
        super(message);
    }

}