package com.quanlyrapphim.quanlyrap.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DOAN")
public class DOAN {
    @Id
    private int idDoAn;
    private String tenDoAn;
    private double giaBan;
    private int soLuongCon;
    private String hinhAnh;

    public int getIdDoAn() {
        return idDoAn;
    }

    public void setIdDoAn(int idDoAn) {
        this.idDoAn = idDoAn;
    }

    public String getTenDoAn() {
        return tenDoAn;
    }

    public void setTenDoAn(String tenDoAn) {
        this.tenDoAn = tenDoAn;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongCon() {
        return soLuongCon;
    }

    public void setSoLuongCon(int soLuongCon) {
        this.soLuongCon = soLuongCon;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

}
