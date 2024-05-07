package com.quanlyrapphim.quanlyrap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.GHE;
import com.quanlyrapphim.quanlyrap.domain.HANGGHE;
import com.quanlyrapphim.quanlyrap.repository.GheRepository;
import com.quanlyrapphim.quanlyrap.repository.HangGheRepository;

@Service
public class GheService {
    private final GheRepository gheRepository;
    private final HangGheRepository hangGheRepository;

    public GheService(GheRepository gheRepository, HangGheRepository hangGheRepository) {
        this.gheRepository = gheRepository;
        this.hangGheRepository = hangGheRepository;
    }

    public List<GHE> getAllGhe() {
        return this.gheRepository.findAll();
    }

    public Optional<GHE> findGheByIdGhe(Integer id) {
        return this.gheRepository.findGheByIdGhe(id);
    }

    public void deleteByIdGhe(Integer id) {
        this.gheRepository.deleteByIdGhe(id);
    }

    public GHE handleSubmitGhe(GHE ghe) {
        return this.gheRepository.save(ghe);
    }

    public List<GHE> findGheByHangGhe(HANGGHE hangGhe) {
        return this.gheRepository.findGheByHangGhe(hangGhe);
    }

}
