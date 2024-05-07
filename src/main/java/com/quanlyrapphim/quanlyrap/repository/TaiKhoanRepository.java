package com.quanlyrapphim.quanlyrap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quanlyrapphim.quanlyrap.domain.TAIKHOAN;

public interface TaiKhoanRepository extends JpaRepository<TAIKHOAN, String> {

    TAIKHOAN save(TAIKHOAN taiKhoan);

    TAIKHOAN findByEmail(String email);

    TAIKHOAN findByIdTaiKhoan(String idTaiKhoan);

    void deleteByIdTaiKhoan(String idTaiKhoan);

    boolean existsByEmail(String email);

    boolean existsByIdTaiKhoan(String idTaiKhoan);

    List<TAIKHOAN> findAll();

}
