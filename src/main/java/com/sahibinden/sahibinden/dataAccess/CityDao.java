package com.sahibinden.sahibinden.dataAccess;

import com.sahibinden.sahibinden.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
}
