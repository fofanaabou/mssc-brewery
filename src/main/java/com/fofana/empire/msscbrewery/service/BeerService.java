package com.fofana.empire.msscbrewery.service;

import com.fofana.empire.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author AFO
 * @Date 16/10/2022
 */
@Service
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
