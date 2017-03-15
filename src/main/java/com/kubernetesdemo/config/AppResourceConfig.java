package com.kubernetesdemo.config;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class AppResourceConfig extends ResourceConfig {

    public AppResourceConfig() {
        packages("com.kubernetesdemo.rest");
    }

}
