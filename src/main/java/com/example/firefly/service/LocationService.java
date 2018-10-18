package com.example.firefly.service;

import com.example.firefly.pojo.Location;

public interface LocationService {

    Location findByName(String name);
}
