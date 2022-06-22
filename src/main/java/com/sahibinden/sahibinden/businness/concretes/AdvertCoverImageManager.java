package com.sahibinden.sahibinden.businness.concretes;

import com.sahibinden.sahibinden.businness.abstracts.AdvertCoverImageService;
import com.sahibinden.sahibinden.dataAccess.AdvertCoverImageDao;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class AdvertCoverImageManager implements AdvertCoverImageService {

    private AdvertCoverImageDao advertCoverImageDao;

    @Autowired
    public AdvertCoverImageManager(AdvertCoverImageDao advertCoverImageDao) {
        this.advertCoverImageDao = advertCoverImageDao;
    }
}
