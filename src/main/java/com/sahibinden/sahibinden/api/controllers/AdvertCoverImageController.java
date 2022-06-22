package com.sahibinden.sahibinden.api.controllers;

import com.sahibinden.sahibinden.businness.abstracts.AdvertCoverImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/advertCoverImage")
public class AdvertCoverImageController {

    private AdvertCoverImageService advertCoverImageService;

    @Autowired
    public AdvertCoverImageController(AdvertCoverImageService advertCoverImageService) {
        this.advertCoverImageService = advertCoverImageService;
    }
}
