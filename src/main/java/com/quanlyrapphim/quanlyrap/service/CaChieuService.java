package com.quanlyrapphim.quanlyrap.service;

import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.CACHIEU;
import com.quanlyrapphim.quanlyrap.repository.CaChieuRepository;

@Service
public class CaChieuService {
    
    private final CaChieuRepository caChieuRepository;

    public CaChieuService(CaChieuRepository caChieuRepository){
        this.caChieuRepository = caChieuRepository;
    }

    public CACHIEU getCaChieuByIdCaChieu(int idCaChieu){
        return this.caChieuRepository.findByIdCaChieu(idCaChieu);
    }

    public Integer getIdPhimByIdCaChieu(int idCaChieu){
        return this.caChieuRepository.findIdPhimByIdCaChieu(idCaChieu);
    }
    

}
