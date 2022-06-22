package com.sahibinden.sahibinden.businness.concretes;

import com.sahibinden.sahibinden.businness.abstracts.AdvertImageService;
import com.sahibinden.sahibinden.dataAccess.AdvertImageDao;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class AdvertImageManager implements AdvertImageService {

    private AdvertImageDao advertImageDao;

    @Autowired
    public AdvertImageManager(AdvertImageDao advertImageDao) {
        this.advertImageDao = advertImageDao;
    }
}
