package com.sahibinden.sahibinden.businness.abstracts;

import com.sahibinden.sahibinden.core.utilities.results.DataResult;
import com.sahibinden.sahibinden.core.utilities.results.Result;
import com.sahibinden.sahibinden.entities.Advert;
import com.sahibinden.sahibinden.entities.User;

import java.util.List;

public interface AdvertService {


    /*
    1.1
    Ürün eklendikten sonra data bilgisi yazdırmayacağımız  için tipi Result olarak belirleyip
    ardından AdvertManager da metodun business kodlarını yazacağız.
     */
    Result add(Advert advert);

    /*
    2.2
    AdvertDao da oluşturduğumuz findAll metodunu buraya yazıyoruz. İşlemin başarılı olup olmadığı konusunda
    dönüş belirtebilmek için Data Result kullanacağız.
    Ardından businnes koşullarını belirlemek için AdvertManagerda bu metodu implemente edeceğiz.
     */
    DataResult<List<Advert>> findAll();

    DataResult<List<Advert>> getAdvertWithUserDetails();

    DataResult<List<Advert>> getByNameContains(String name);

    DataResult<List<Advert>> getAllAdvertsSortedDesc(String title);

    DataResult<List<Advert>> getAllAdvertsSortedAsc(String title);

    DataResult<List<Advert>> getAllAdvertsSortedDesc();

    DataResult<List<Advert>> findAllByOrderByCreateDateDesc();

  //  DataResult<List<User>> findAllUser();


}
