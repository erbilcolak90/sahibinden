package com.sahibinden.sahibinden.businness.concretes;

import com.sahibinden.sahibinden.businness.abstracts.AdvertService;
import com.sahibinden.sahibinden.dataAccess.AdvertDao;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class AdvertManager implements AdvertService {

    private AdvertDao advertDao;

    @Autowired
    public AdvertManager(AdvertDao advertDao) {
        this.advertDao = advertDao;
    }
}
