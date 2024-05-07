package com.quanlyrapphim.quanlyrap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.TAIKHOAN;
import com.quanlyrapphim.quanlyrap.domain.VAITRO;
import com.quanlyrapphim.quanlyrap.domain.dto.registerDTO;
import com.quanlyrapphim.quanlyrap.repository.TaiKhoanRepository;
import com.quanlyrapphim.quanlyrap.repository.VaiTroRepository;

@Service
public class TaiKhoanService {

    private final TaiKhoanRepository taiKhoanRepository;
    private final VaiTroRepository vaiTroRepository;

    public TaiKhoanService(TaiKhoanRepository taiKhoanRepository, VaiTroRepository vaiTroRepository) {
        this.taiKhoanRepository = taiKhoanRepository;
        this.vaiTroRepository = vaiTroRepository;
    }

    public List<TAIKHOAN> findAllTaiKhoan() {
        return this.taiKhoanRepository.findAll();
    }

    public TAIKHOAN getTaiKhoanById(String id) {
        return this.taiKhoanRepository.findByIdTaiKhoan(id);
    }

    public void deleteTaiKhoanById(String id) {
        this.taiKhoanRepository.deleteByIdTaiKhoan(id);
    }

    public TAIKHOAN handleSubmitTaikhoan(TAIKHOAN taikhoan) {
        return this.taiKhoanRepository.save(taikhoan);
    }

    public VAITRO getVaiTroByTen(String tenVaiTro) {
        return this.vaiTroRepository.findByLoaiVaiTro(tenVaiTro);
    }

    public boolean checkEmailExist(String email) {
        return this.taiKhoanRepository.existsByEmail(email);
    }

    public TAIKHOAN registerDTOToTaikhoan(registerDTO registerDTO) {
        TAIKHOAN taikhoan = new TAIKHOAN();
        taikhoan.setIdTaiKhoan(registerDTO.getIdTaiKhoan());
        taikhoan.setEmail(registerDTO.getEmail());
        taikhoan.setMatKhau(registerDTO.getPassword());
        return taikhoan;
    }

    public TAIKHOAN getTaiKhoanByEmail(String email) {
        return this.taiKhoanRepository.findByEmail(email);
    }

}
