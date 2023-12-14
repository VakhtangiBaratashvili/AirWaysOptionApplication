package com.exam.vakho_baratashvili.service;

import com.exam.vakho_baratashvili.entity.City;

import java.util.List;

public interface CityService {
    City addCity(City city);
    List<City> getAllCities();
}
