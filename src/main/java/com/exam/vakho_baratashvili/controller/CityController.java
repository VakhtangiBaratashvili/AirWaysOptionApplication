package com.exam.vakho_baratashvili.controller;


import com.exam.vakho_baratashvili.entity.City;
import com.exam.vakho_baratashvili.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cities")
public class CityController {


    private final CityService service;

    @PostMapping
    public City addCity(@RequestBody City city) {
        return service.addCity(city);
    }

    @GetMapping
    public List<City> getAllCities() {
        return service.getAllCities();
    }
}
