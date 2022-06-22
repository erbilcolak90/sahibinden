package com.sahibinden.sahibinden.businness.concretes;

import com.sahibinden.sahibinden.businness.abstracts.CityService;
import com.sahibinden.sahibinden.dataAccess.CityDao;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }
}
