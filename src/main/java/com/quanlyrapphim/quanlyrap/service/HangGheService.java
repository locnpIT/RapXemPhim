package com.quanlyrapphim.quanlyrap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.HANGGHE;
import com.quanlyrapphim.quanlyrap.repository.HangGheRepository;

@Service
public class HangGheService {
    private final HangGheRepository hangGheRepository;

    public HangGheService(HangGheRepository hangGheRepository) {
        this.hangGheRepository = hangGheRepository;
    }

    public List<HANGGHE> findAllHangGhe() {
        return this.hangGheRepository.findAll();
    }

}
