package com.levi.microservicedemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.logging.LogManager;

@RestController
public class HelloController {
    Logger LOGGER = LoggerFactory.getLogger(HelloController.class.getSimpleName());
    @GetMapping("/hello/{name}")
    public String getAllBook(@PathVariable String name) {
        LOGGER.info("Received Hello Request {}", name);
        return "hello " + name;
    }
}
