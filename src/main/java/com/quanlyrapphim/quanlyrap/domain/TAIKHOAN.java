package com.quanlyrapphim.quanlyrap.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "TAIKHOAN")
public class TAIKHOAN {

    @Id
    private String idTaiKhoan;
    private String matKhau;
    @Email(message = "Email không hợp lệ", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    @ManyToOne
    @JoinColumn(name = "idVaiTro")
    private VAITRO vaiTro;

    @OneToMany(mappedBy = "taiKhoan")
    private List<HOADON> listHoaDon;

    public VAITRO getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(VAITRO vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(String idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<HOADON> getListHoaDon() {
        return listHoaDon;
    }

    public void setListHoaDon(List<HOADON> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }

}
