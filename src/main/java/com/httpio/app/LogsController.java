package com.httpio.app;

import com.httpio.app.Models.Log;
import com.httpio.app.Models.LogBase;
import com.httpio.app.Models.LogBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LogsController {
    @Autowired
    LogBaseRepository logRepository;

    // @PostMapping(path="/add") // Map ONLY POST Requests
    // public @ResponseBody String addNewUser (@RequestParam String name
    //         , @RequestParam String email) {
    //     // @ResponseBody means the returned String is the response, not a view name
    //     // @RequestParam means it is a parameter from the GET or POST request

    //     User n = new User();
    //     n.setName(name);
    //     n.setEmail(email);
    //     userRepository.save(n);
    //     return "Saved";
    // }

    // @RequestMapping(value = "/logs", method= RequestMethod.POST)
    @PostMapping(value = "/logs")
    public Log post(@RequestParam(value="message", defaultValue="World") String message) {
        LogBase log = new LogBase();

        log.setMessage(message);

        logRepository.save(log);

        return log;
    }
}