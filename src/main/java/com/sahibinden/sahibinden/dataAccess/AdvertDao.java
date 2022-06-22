package com.sahibinden.sahibinden.dataAccess;

import com.sahibinden.sahibinden.entities.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

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
}
