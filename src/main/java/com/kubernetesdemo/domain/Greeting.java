package com.kubernetesdemo.domain;

import java.io.Serializable;

public class Greeting implements Serializable {

    private String message;

    public Greeting() {}

    public Greeting(String name) {
        this.message = String.format("Hello %s!", name);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
