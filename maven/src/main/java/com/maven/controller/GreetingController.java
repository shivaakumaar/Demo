package com.maven.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maven.model.Greeting;

@RestController
public class GreetingController {
	
	 private static final Logger LOGGER = LogManager.getLogger(GreetingController.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	
    	LOGGER.info("entered into greeting ---------------------> ");
    	Greeting  gr  = new Greeting();
    	gr.setId(12345);
    	gr.setContent("shiva");
    	
    	LOGGER.info("entered into greeting ---------------------> "+ gr);
        return gr;
    }
}
