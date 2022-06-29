package com.sahibinden.sahibinden.dataAccess;

import com.sahibinden.sahibinden.entities.Advert;
import com.sahibinden.sahibinden.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdvertDao extends JpaRepository<Advert,Integer> {
 /*
  1-Dao' da oluşturulacak fonksiyonlar aynı şekilde AdvertServisine yazılıp ardından
  AdvertManagere implemente edilmelidir.
  2-AdvertManager içersindeki advertDao referansı ile oluşturduğumuz constructor,
  @Autowired anotasyonuyla bu kısma erişip ilgili fonksiyonu otomatik olarak eşleştirecek.

  controller katmanı ile ilişkilendirme
  3-AdvertController içersinde AdvertService tipinde oluşturacağımız referansla beraber controllerdaki
  @Autowired anotasyonu içeren bu constructor classları otomatikman tarayacak
  4-@Service katmanı olan ve @Service annotasyonu içeren AdvertManager a ulaşacak
  5-bu manager içersindeki AdvertDao referansı ve @Autowired annotasyonu içeren constructoru ile
  Dao katmanındaki fonksiyonları kullanacak
    */


    /*
    2.1
    Database de yer alan advert listesindeki tüm advertleri listeleyip görüntüleyebilmek için JpaRepository 'nin findall
    metodunu kullanacağız.
    ardından bu metodu AdvertService e yazacağız.
     */
    List<Advert> findAll();

    List<Advert> getByNameContains(String name);

   // List<User> findAllUser();

    List<Advert> findAllByOrderByCreateDateDesc();


    @Query(value = "SELECT a.id,a.name,a.advertNumber,a.price,u.id,u.name,u.surname FROM adverts a Full Join users u On a.userId=u.id ORDER BY u.id",nativeQuery = true)
    List<Advert> getAdvertWithUserDetails();




}
