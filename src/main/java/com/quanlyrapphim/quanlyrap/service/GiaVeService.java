package com.quanlyrapphim.quanlyrap.service;

import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.GIAVE;
import com.quanlyrapphim.quanlyrap.repository.GiaVeRepository;

@Service
public class GiaVeService {

    private final GiaVeRepository giaVeRepository;

    public GiaVeService(GiaVeRepository giaVeRepository) {
        this.giaVeRepository = giaVeRepository;
    }

    public GIAVE getGiaVeById(int id) {
        return this.giaVeRepository.findByIdGiaVe(id);
    }

}
