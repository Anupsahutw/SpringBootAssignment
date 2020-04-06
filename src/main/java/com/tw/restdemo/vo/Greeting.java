package com.tw.restdemo.vo;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
    private  String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCustomMessage(String message) {

        content = "Hi "+ message;
    }
}
