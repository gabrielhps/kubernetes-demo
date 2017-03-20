package com.kubernetesdemo.domain;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Greeting implements Serializable {

    private String message;

    public Greeting() {}

    public Greeting(String name) {
        this.message = String.format("Hello %s! You're at %s", name, getLocalHostName());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String getLocalHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "Unknown host";
        }
    }

}
