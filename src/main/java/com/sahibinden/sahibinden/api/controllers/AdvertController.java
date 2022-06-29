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

    @GetMapping("/getAllAdverts")
    public DataResult<List<Advert>> getAll(){
        return this.advertService.findAll();
    }


    @GetMapping("/getAdvertWithUserDetails")
    public DataResult<List<Advert>> getAdvertWithUserDetails(){
        return this.advertService.getAdvertWithUserDetails();
    }

    @GetMapping("/getByAdvertNameContains")
    public DataResult<List<Advert>> getByNameContains(@RequestParam String name){
        return this.advertService.getByNameContains(name);
    }

    @GetMapping("/getAllAdvertsSortedDescWith")
    public DataResult<List<Advert>> getAllAdvertsSortedDesc(@RequestParam String title){
        return this.advertService.getAllAdvertsSortedDesc(title);
    }

    @GetMapping("/getAllAdvertsSortedDesc")
    public DataResult<List<Advert>> getAllAdvertsSortedDesc(){
        return this.advertService.getAllAdvertsSortedDesc();
    }

    @GetMapping("/getAllAdvertsSortedAsc")
    public DataResult<List<Advert>> getAllAdvertsSortedAsc(@RequestParam String title){
        return this.advertService.getAllAdvertsSortedAsc(title);
    }

}
