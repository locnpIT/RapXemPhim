package com.quanlyrapphim.quanlyrap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.HOADON;

@Repository
public interface HoaDonRepository extends JpaRepository<HOADON, Integer> {
    List<HOADON> findAll();

    HOADON getHoadonByIdHoaDon(int idHoaDon);

    HOADON save(HOADON hoadon);
}
