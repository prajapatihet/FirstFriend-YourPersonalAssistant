package com.techflix.firstfriend;

public class Message {
    public static String SENT_BY_ME = "me";
    public static String SENT_BY_BOT="bot";
    // model for handle getter and setter operation
    String message;
    String sentBy;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    public Message(String message, String sentBy) {
        this.message = message;
        this.sentBy = sentBy;
    }
}
