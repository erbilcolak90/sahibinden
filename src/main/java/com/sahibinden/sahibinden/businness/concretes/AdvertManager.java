package com.sahibinden.sahibinden.businness.concretes;

import com.sahibinden.sahibinden.businness.abstracts.AdvertService;
import com.sahibinden.sahibinden.core.utilities.results.DataResult;
import com.sahibinden.sahibinden.core.utilities.results.Result;
import com.sahibinden.sahibinden.core.utilities.results.SuccessDataResult;
import com.sahibinden.sahibinden.core.utilities.results.SuccessResult;
import com.sahibinden.sahibinden.dataAccess.AdvertDao;
import com.sahibinden.sahibinden.entities.Advert;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    /*
    2.3
    AdvertService'den implement ettiğimiz metodun Succes bilgisini mesaj olarak belirtip
    advertdao referansı ile findAll metodunu  kullanacağız.
    Ardından AdvertController da mapping işlemini gerçekleştireceğiz.
     */
    @Override
    public DataResult<List<Advert>> findAll() {
        return new SuccessDataResult<List<Advert>>("Adverts listed",this.advertDao.findAll());
    }
    /*
    public DataResult<List<Advert>> getAdvertWithUserDetails(int advertId){
        return new SuccessDataResult<List<Advert>>("Advert listed",this.advertDao.getAdvertWithUserDetails(advertId));
    }
    */
}

