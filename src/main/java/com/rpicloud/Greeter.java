package com.rpicloud;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mixmox on 04/04/16.
 */

@RestController
public class Greeter {

    @Value("${greeting}")
    String greeting;

   /* @Value("${server.port}")
    int port;

    @Value("${configuration.projectName}")
    String projectName;*/

    @RequestMapping(value = "/", produces = "application/json")
    public List<String> index(){
        List<String> env = Arrays.asList(
                "message.greeting is: " + greeting,
                "server.port is: " + "9000",
                "configuration.projectName is: " + "demo"
        );
        return env;
    }
}