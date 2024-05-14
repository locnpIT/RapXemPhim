package com.quanlyrapphim.quanlyrap.service;

import java.util.List;

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

    public List<HOADON> getListHoaDonByUserId(String idUser) {
        return this.hoaDonRepository.getListHoaDonByUserId(idUser);
    }

}
