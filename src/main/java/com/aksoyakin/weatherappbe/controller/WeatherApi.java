package com.aksoyakin.weatherappbe.controller;

import com.aksoyakin.weatherappbe.dto.WeatherDto;
import com.aksoyakin.weatherappbe.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/weather")
public class WeatherApi {

    private final WeatherService weatherService;

    public WeatherApi(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public ResponseEntity<WeatherDto> getWeather(@PathVariable("city") String city) {
        return ResponseEntity.ok(weatherService.getWeatherByCityName(city));
    }
}
