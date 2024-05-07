package com.quanlyrapphim.quanlyrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.VAITRO;

import jakarta.transaction.Transactional;

@Repository
public interface VaiTroRepository extends JpaRepository<VAITRO, Integer> {

    @Transactional
    @Query("SELECT v FROM VAITRO v WHERE v.loaiVaiTro = :loaiVaiTro")
    VAITRO findByLoaiVaiTro(@Param("loaiVaiTro") String loaiVaiTro);

}