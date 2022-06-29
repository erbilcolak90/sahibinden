package com.sahibinden.sahibinden.businness.concretes;

import com.sahibinden.sahibinden.businness.abstracts.AdvertService;
import com.sahibinden.sahibinden.core.utilities.results.DataResult;
import com.sahibinden.sahibinden.core.utilities.results.Result;
import com.sahibinden.sahibinden.core.utilities.results.SuccessDataResult;
import com.sahibinden.sahibinden.core.utilities.results.SuccessResult;
import com.sahibinden.sahibinden.dataAccess.AdvertDao;
import com.sahibinden.sahibinden.entities.Advert;
import com.sahibinden.sahibinden.entities.User;
import lombok.NoArgsConstructor;
import net.bytebuddy.description.type.TypeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@NoArgsConstructor
public class AdvertManager implements AdvertService {

    private AdvertDao advertDao;

    @Autowired
    public AdvertManager(AdvertDao advertDao) {
        this.advertDao = advertDao;
    }


    /*
    1.2
    AdvertDao tipinde oluşturduğumuz referans ile JpaRepository içersindeki save metodunu kullanıp advert i sisteme yüklüyoruz.
    ardından AdvertController da mapping yapacağız.
     */
    @Override
    public Result add(Advert advert) {
        advert.setCreateDate(new Date());
        advert.setUpdateDate(new Date());
        advert.setFavoriteCount(0);
        advert.setDeleted(false);
        advert.setActive(true);

        this.advertDao.save(advert);
        return new SuccessResult("advert is uploaded");
    }

    @Override
    public DataResult<List<Advert>> findAll() {
        return new SuccessDataResult<List<Advert>>("Adverts listed",this.advertDao.findAll());
    }


    @Override
    public DataResult<List<Advert>> getAdvertWithUserDetails() {
        return new SuccessDataResult<List<Advert>>("advert and user details:",this.advertDao.getAdvertWithUserDetails());
    }

    /*
    @Override
    public DataResult<List<User>> findAllUser() {
        return new SuccessDataResult<List<User>>("users details",this.advertDao.findAllUser());
    }

     */

    @Override
    public DataResult<List<Advert>> getByNameContains(String name) {
        return new SuccessDataResult<List<Advert>>("adverts listed",this.advertDao.getByNameContains(name));
    }

    @Override
    public DataResult<List<Advert>> getAllAdvertsSortedDesc(String title) {
        Sort sort = Sort.by(Sort.Direction.DESC,title);
        return new SuccessDataResult<List<Advert>>("Adverts descending from "+title+" ",this.advertDao.findAll(sort));
    }

    @Override
    public DataResult<List<Advert>> findAllByOrderByCreateDateDesc() {
        return new SuccessDataResult<List<Advert>>("default",this.advertDao.findAllByOrderByCreateDateDesc());
    }

    @Override
    public DataResult<List<Advert>> getAllAdvertsSortedDesc() {
        Sort sort = Sort.by(Sort.Direction.DESC,"createDate");

        return new SuccessDataResult<List<Advert>>("descending by default",this.advertDao.findAll(sort));
    }

    @Override
    public DataResult<List<Advert>> getAllAdvertsSortedAsc(String title) {
        Sort sort = Sort.by(Sort.Direction.ASC,title);
        return new SuccessDataResult<List<Advert>>("Adverts ascending from "+title+" ",this.advertDao.findAll(sort));
    }
}

