package com.example.Resto.service;

import com.example.Resto.entity.Resto;
import com.example.Resto.repository.RestoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RestoServiceImpl implements RestoService{
    @Autowired
    private RestoRepository restoRepository;

    @Override
    public List<Resto> getAllResto() {
        return restoRepository.findAll();
    }

    @Override
    public Resto getRestoById(Long id) {
        return restoRepository.findById(id).orElse(null);
    }

    @Override
    public Resto saveResto(Resto resto) {
        return restoRepository.save(resto);
    }

    @Override
    public Resto updateResto(Long id, Resto resto) {
        resto.setId(id);
        return restoRepository.save(resto);
    }

    @Override
    public void deleteResto(Long id) {
        restoRepository.deleteById(id);
    }
}
