package com.db.docker.springbootdocker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class DeveloperTest {

    @GetMapping("/test")
    public String test() {
        return "HEY Developer!!TEST SUCCESS";
    }
}
