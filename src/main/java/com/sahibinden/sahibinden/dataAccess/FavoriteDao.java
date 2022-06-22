package com.sahibinden.sahibinden.dataAccess;

import com.sahibinden.sahibinden.entities.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteDao extends JpaRepository<Favorite,Integer> {
}
