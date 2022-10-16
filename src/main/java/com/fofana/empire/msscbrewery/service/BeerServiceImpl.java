package com.fofana.empire.msscbrewery.service;

import com.fofana.empire.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author AFO
 * @Date 16/10/2022
 */
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto
                .builder()
                .id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
