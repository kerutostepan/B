package com.example.x;

import com.example.x.Service.AppointmentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class XApplication {
    public static void main(String[] args) {
        SpringApplication.run(XApplication.class, args);
    }

}
