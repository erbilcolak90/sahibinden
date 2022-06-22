package com.sahibinden.sahibinden.businness.concretes;

import com.sahibinden.sahibinden.businness.abstracts.ProfileImageService;
import com.sahibinden.sahibinden.dataAccess.ProfileImageDao;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ProfileImageManager implements ProfileImageService {

    private ProfileImageDao profileImageDao;

    @Autowired
    public ProfileImageManager(ProfileImageDao profileImageDao) {
        this.profileImageDao = profileImageDao;
    }
}
