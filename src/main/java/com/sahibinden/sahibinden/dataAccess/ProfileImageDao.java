package com.sahibinden.sahibinden.dataAccess;

import com.sahibinden.sahibinden.entities.ProfileImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileImageDao extends JpaRepository<ProfileImage,Integer> {
}
