package com.sahibinden.sahibinden.api.controllers;

import com.sahibinden.sahibinden.businness.abstracts.AdvertService;
import com.sahibinden.sahibinden.core.utilities.results.DataResult;
import com.sahibinden.sahibinden.core.utilities.results.Result;
import com.sahibinden.sahibinden.entities.Advert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/advert")
public class AdvertController {

    private AdvertService advertService;

    @Autowired
    public AdvertController(AdvertService advertService) {
        this.advertService = advertService;
    }

    /*
    1.3
    Database e ekleme yapacağımız için postmapping kullanacağız.
    AdvertService tipinde referans ile AdvertService Interface indeki metodu kullanacağız.
     */
    @PostMapping("/addAdvert")
    public Result addAdvert(@RequestBody Advert advert){
        return this.advertService.add(advert);
    }

    /*
    2.4
    Getmapping annotasyonu ile (getAllAdverts) findAll metodunu advertService'ten çekiyoruz.
     */

    @GetMapping("/getAllAdverts")
    public DataResult<List<Advert>> getAll(){
        return this.advertService.findAll();
    }

    @GetMapping("/getAdvertWithUserDetails")
    public DataResult<List<Advert>> getAdvertWithUserDetails(){
        return this.advertService.getAdvertWithUserDetails();
    }
}
