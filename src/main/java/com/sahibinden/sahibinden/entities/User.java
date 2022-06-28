package com.sahibinden.sahibinden.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "createDate")
    private Date createDate;

    @Column(name = "updateDate")
    private Date updateDate;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "profilePictureId")
    private int profilePictureId;

    @Column(name = "phone")
    @Nullable
    private String phone;

    @Column(name = "isPhoneActive")
    private boolean isPhoneActive;

}
