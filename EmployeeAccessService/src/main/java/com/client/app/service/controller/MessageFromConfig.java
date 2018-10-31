package com.client.app.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageFromConfig {
	
	@Value("${msg:Hello - Config Server is not working..pelase check}")
    private String message;
	
    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }

}
