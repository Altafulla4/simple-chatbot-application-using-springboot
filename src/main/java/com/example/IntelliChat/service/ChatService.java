package com.example.IntelliChat.service;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

@Service
public class ChatService {

    private static final Logger logger =
            LoggerFactory.getLogger(ChatService.class);

    public String getReply(String message) {

        logger.info("Processing message: {}", message);

        String msg = message.toLowerCase().trim();
        String reply;

        if (msg.isEmpty()) {
            reply = "Please enter a valid message.";
        }
        else if (msg.equals("hi") || msg.equals("hello")) {
            reply = "Hello How can I help you?";
        }
        else if (msg.equals("bye")) {
            reply = "Goodbye";
        }
        else if (msg.contains("java")) {
            reply = "Java is a programming language used to build applications.";
        }
        else if (msg.contains("spring")) {
            reply = "Spring Boot helps build REST APIs quickly.";
        }
        else if (msg.contains("time")) {
            reply = "Current time: " + LocalDateTime.now().toLocalTime();
        }
        else if (msg.contains("date")) {
            reply = "Today's date: " + LocalDateTime.now().toLocalDate();
        }
        else if (msg.contains("name") || msg.contains("who")) {
            reply = "I am IntelliChat, your what's app chatbot ";
        }
        else if (msg.contains("help")) {
            reply = "Try: hi, bye, java, spring, time, date";
        }
        else {
            reply = "I didn’t understand that. Type 'help' to see options.";
        }

        logger.info("Generated reply: {}", reply);

        return reply;
    }
}
