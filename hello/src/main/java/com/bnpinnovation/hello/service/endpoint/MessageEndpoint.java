package com.bnpinnovation.hello.service.endpoint;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="message")
public interface MessageEndpoint {
    @RequestMapping(method= RequestMethod.GET, value="/message")
    String message();
}
