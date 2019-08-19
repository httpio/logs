package com.httpio.app.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "logs")
public class LogBase implements Log {
    @Id
    String id;
    String message;

    public LogBase() {
        id = UUID.randomUUID().toString();
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
