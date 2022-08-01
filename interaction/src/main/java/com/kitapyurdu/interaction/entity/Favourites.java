package com.kitapyurdu.interaction.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Favourites {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int favoriteId;
    private String favoriteDesc;
    private int userId;
    private int productId;


    public Favourites() {
    }

    public Favourites(int favoriteId, String favoriteDesc, int userId, int productId) {
        this.favoriteId = favoriteId;
        this.favoriteDesc = favoriteDesc;
        this.userId = userId;
        this.productId = productId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    public String getFavoriteDesc() {
        return favoriteDesc;
    }

    public void setFavoriteDesc(String favoriteDesc) {
        this.favoriteDesc = favoriteDesc;
    }

}
