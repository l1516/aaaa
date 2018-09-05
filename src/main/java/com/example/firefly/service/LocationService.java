package com.example.firefly.service;

import com.example.firefly.pojo.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationService extends JpaRepository<Location, Long> {

    Location findByName(String name);
}
