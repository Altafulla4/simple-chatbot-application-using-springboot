package com.example.IntelliChat.controller;

import com.example.IntelliChat.model.MessageRequest;
import com.example.IntelliChat.service.ChatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private static final Logger logger =
            LoggerFactory.getLogger(WebhookController.class);

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {

        logger.info("Incoming message: {}", request.getMessage());

        if (request.getMessage() == null || request.getMessage().isEmpty()) {
            logger.warn("Empty message received");
            return "Invalid message";
        }

        String response = chatService.getReply(request.getMessage());
        logger.info("Bot response: {}", response);

        return response;
    }
}
