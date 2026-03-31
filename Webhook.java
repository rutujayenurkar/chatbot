package com.example.demo.controller;

import com.example.demo.model.MessageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class Webhook {

 @PostMapping("/webhook")
public String receiveMessage(@RequestBody MessageRequest request) {

 String userMessage = request.getMessage();
 System.out.println("Incoming Message: " + userMessage);

      if (userMessage.equalsIgnoreCase("Hi")) {
        return "Hello";
      } else if (userMessage.equalsIgnoreCase("Bye")) {
        return "Goodbye";
      } else {
        return "I didn't understand that.";
	  }
   }
}
