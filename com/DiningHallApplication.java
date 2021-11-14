package com;

import com.service.DiningHallService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiningHallApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiningHallApplication.class, args);

        DiningHallService diningHallService = DiningHallService.getInstance();
        diningHallService.openDiningHall();

    }
}
