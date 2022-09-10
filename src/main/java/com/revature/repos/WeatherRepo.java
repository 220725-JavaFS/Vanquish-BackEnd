package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Weather;

public interface WeatherRepo extends JpaRepository<Weather, String> {

}
