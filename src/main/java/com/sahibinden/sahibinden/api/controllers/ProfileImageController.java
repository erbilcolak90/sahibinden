package com.sahibinden.sahibinden.api.controllers;

import com.sahibinden.sahibinden.businness.abstracts.ProfileImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profileImage")
public class ProfileImageController {

    private ProfileImageService profileImageService;

    @Autowired
    public ProfileImageController(ProfileImageService profileImageService) {
        this.profileImageService = profileImageService;
    }
}
