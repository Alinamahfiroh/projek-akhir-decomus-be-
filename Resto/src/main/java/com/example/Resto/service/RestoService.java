package com.example.Resto.service;

import com.example.Resto.entity.Resto;

import java.util.Date;
import java.util.List;
public interface RestoService {

    Resto saveResto(Resto resto);

    Resto getRestoById(Long id);

    List<Resto> getAllResto();

    Resto updateResto(Long id, Resto resto);

    void deleteResto(Long id);

}
