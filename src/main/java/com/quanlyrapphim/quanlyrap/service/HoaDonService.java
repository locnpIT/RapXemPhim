package com.quanlyrapphim.quanlyrap.service;

import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.HOADON;
import com.quanlyrapphim.quanlyrap.repository.HoaDonRepository;

@Service
public class HoaDonService {
    private final HoaDonRepository hoaDonRepository;

    public HoaDonService(HoaDonRepository hoaDonRepository) {
        this.hoaDonRepository = hoaDonRepository;
    }

    public HOADON handleSave(HOADON hoadon) {
        return this.hoaDonRepository.save(hoadon);
    }

}
