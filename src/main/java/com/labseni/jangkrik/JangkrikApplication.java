package com.labseni.jangkrik;
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;

import java.sql.*;
import java.util.*;
import java.net.URISyntaxException;
import java.net.URI;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class JangkrikApplication {

    @RequestMapping("/")
  //  @ResponseBody
    String home(Model model) {
      return "home";
    }

    public static void main(String[] args) {
        SpringApplication.run(JangkrikApplication.class, args);
    }
}


