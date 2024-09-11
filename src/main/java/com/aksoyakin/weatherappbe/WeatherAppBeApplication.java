package com.aksoyakin.weatherappbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WeatherAppBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherAppBeApplication.class, args);
    }

}
