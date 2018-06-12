package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class CustomController {

	private final Logger logger = LoggerFactory.getLogger(CustomController.class.getName());

	@Value("${demo.value}")
    String demo;

    @RequestMapping(value = "/custom", method = RequestMethod.GET)
    public String custom() {
    	logger.info("/custom is being called");
        String my_var = System.getenv("MY_VAR");

        if (my_var != null) {
            return "custom=" + my_var + ":" + demo;
        }
        else {
            return "Hello World, RD !";
        }
    }
}