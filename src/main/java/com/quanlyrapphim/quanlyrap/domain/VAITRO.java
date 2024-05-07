package com.quanlyrapphim.quanlyrap.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "VAITRO")
public class VAITRO {

    @Id
    private int idVaiTro;
    private String loaiVaiTro;

    @OneToMany(mappedBy = "vaiTro")
    private List<TAIKHOAN> listTaiKhoan;
    

    public int getIdVaiTro() {
        return idVaiTro;
    }

    public void setIdVaiTro(int idVaiTro) {
        this.idVaiTro = idVaiTro;
    }

    public String getLoaiVaiTro() {
        return loaiVaiTro;
    }

    public void setLoaiVaiTro(String loaiVaiTro) {
        this.loaiVaiTro = loaiVaiTro;
    }

    public List<TAIKHOAN> getListTaiKhoan() {
        return listTaiKhoan;
    }

    public void setListTaiKhoan(List<TAIKHOAN> listTaiKhoan) {
        this.listTaiKhoan = listTaiKhoan;
    }

}
