package com.example.demo;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${url}")
	private String url;
	
	@RequestMapping("/")
    public String index() {
        return MessageFormat.format("Hello {0}", url);
    }
}
