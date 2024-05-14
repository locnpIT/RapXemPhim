package com.quanlyrapphim.quanlyrap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.HOADON;

@Repository
public interface HoaDonRepository extends JpaRepository<HOADON, Integer> {
    List<HOADON> findAll();

    HOADON getHoadonByIdHoaDon(int idHoaDon);

    HOADON save(HOADON hoadon);

    @Query(value = "SELECT * FROM HOADON WHERE idTaiKhoan = :idTaiKhoan", nativeQuery = true)
    List<HOADON> getListHoaDonByUserId(@Param("idTaiKhoan") String idTaiKhoan);
}
