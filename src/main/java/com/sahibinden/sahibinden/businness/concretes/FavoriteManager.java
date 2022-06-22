package com.sahibinden.sahibinden.businness.concretes;

import com.sahibinden.sahibinden.businness.abstracts.FavoriteService;
import com.sahibinden.sahibinden.dataAccess.FavoriteDao;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class FavoriteManager implements FavoriteService {

    private FavoriteDao favoriteDao;

    @Autowired
    public FavoriteManager(FavoriteDao favoriteDao) {
        this.favoriteDao = favoriteDao;
    }
}
