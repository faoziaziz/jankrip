package com.labseni.jangkrik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class JangkrikApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Krik Krik Jangkrik";
    }

    public static void main(String[] args) {
        SpringApplication.run(JangkrikApplication.class, args);
    }
}
