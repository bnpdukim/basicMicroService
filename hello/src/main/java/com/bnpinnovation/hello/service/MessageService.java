package com.bnpinnovation.hello.service;

import com.bnpinnovation.hello.service.endpoint.MessageEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface MessageService {
    String message();

    @Service
    @Slf4j
    class PollingMessageService implements MessageService {
        @Autowired
        MessageEndpoint endpoint;
        @Override
        public String message() {
            return endpoint.message();
        }
    }
}
