package com.httpio.app;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogsController {

    @RequestMapping(value = "/logs", method= RequestMethod.GET)
    public Log post(@RequestParam(value="name", defaultValue="World") String name) {

        return new Log(UUID.randomUUID().toString(), "Test");
    }
}