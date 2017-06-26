package com.abhishek.myappclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jawala on 6/26/2017.
 */
@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String hello() {
        String url = "http://MYAPP-SERVER/api/server";
        return restTemplate.getForObject(url, String.class);
    }
}
