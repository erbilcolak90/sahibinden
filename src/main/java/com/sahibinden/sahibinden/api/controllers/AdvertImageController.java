package com.sahibinden.sahibinden.api.controllers;

import com.sahibinden.sahibinden.businness.abstracts.AdvertImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/advertImage")
public class AdvertImageController {

    private AdvertImageService advertImageService;

    @Autowired
    public AdvertImageController(AdvertImageService advertImageService) {
        this.advertImageService = advertImageService;
    }
}
