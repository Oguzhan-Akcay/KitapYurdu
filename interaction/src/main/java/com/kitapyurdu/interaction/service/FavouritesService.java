package com.kitapyurdu.interaction.service;

import com.kitapyurdu.interaction.entity.Favourites;
import com.kitapyurdu.interaction.exception.AddFavouritesException;
import com.kitapyurdu.interaction.mapper.FavouritesMapper;
import com.kitapyurdu.interaction.repository.FavouritesRepository;
import com.kitapyurdu.interaction.response.FavouritesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavouritesService {

    @Autowired
    FavouritesMapper favouritesMapper;

    @Autowired
    FavouritesRepository favouritesRepository;

}
