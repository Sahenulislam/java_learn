package com.learn.java.accessories;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class SimpleWebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String receivedMessage = message.getPayload();
        System.out.println("Received message: " + receivedMessage);

        // Echo the received message back to the client
        session.sendMessage(new TextMessage("Server response: " + receivedMessage));
    }
}
