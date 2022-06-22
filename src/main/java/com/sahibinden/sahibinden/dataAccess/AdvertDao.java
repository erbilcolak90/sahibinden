package com.sahibinden.sahibinden.dataAccess;

import com.sahibinden.sahibinden.entities.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertDao extends JpaRepository<Advert,Integer> {

}
