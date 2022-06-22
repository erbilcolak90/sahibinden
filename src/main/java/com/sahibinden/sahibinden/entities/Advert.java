package com.sahibinden.sahibinden.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "adverts")
public class Advert {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;

@Column(name = "createDate")
private Date createDate;

@Column(name = "updateDate")
private Date updateDate;

@Column(name = "deleteDate")
private Date deleteDate;

@Column(name = "name")
private String name;

@Column(name = "url")
private String url;

@Column(name = "categoryId")
private int categoryId;

@Column(name = "advertNumber")
private int advertNumber;

@Column(name = "price")
private int price;

@Column(name = "userId")
private int userId;

@Column(name = "cityId")
private int cityId;

@Column(name = "favoriteCount")
private int favoriteCount;

@Column(name = "isDeleted")
private boolean isDeleted;

@Column(name = "isActive")
private boolean isActive;

}
