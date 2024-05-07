package com.quanlyrapphim.quanlyrap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.CACHIEU;
import com.quanlyrapphim.quanlyrap.domain.PHIM;
import com.quanlyrapphim.quanlyrap.repository.PhimRepository;

@Service
public class PhimService {

    private final PhimRepository phimRepository;

    public PhimService(PhimRepository phimRepository) {
        this.phimRepository = phimRepository;
    }

    public List<PHIM> getAllPhim() {
        return this.phimRepository.findAll();
    }

    public void deleteById(int id) {
        this.phimRepository.deleteByIdPhim(id);
    }

    public PHIM handleSubmit(PHIM phim) {
        return this.phimRepository.save(phim);
    }

    public PHIM getPhimByidPhim(int idPhim) {
        return this.phimRepository.getPhimByidPhim(idPhim);
    }

    public List<CACHIEU> getCaChieuByIdPhim(int idPhim) {
        return this.phimRepository.findAllCachieusByIdPhim(idPhim);
    }

    
    public String getTenPhimByIdPhim(int idPhim) {
        return this.phimRepository.getTenPhimByIdPhim(idPhim);
    }

}
