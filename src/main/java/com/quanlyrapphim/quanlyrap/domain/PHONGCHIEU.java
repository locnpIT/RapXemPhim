package com.quanlyrapphim.quanlyrap.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PHONGCHIEU")
public class PHONGCHIEU {
    @Id
    private String idPhong;
    private String tenPhong;

    @OneToMany(mappedBy = "phongChieu")
    private List<GHE> danhSachGhe;

    public String getIdPhong() {
        return idPhong;
    }

    public List<GHE> getDanhSachGhe() {
        return danhSachGhe;
    }

    public void setDanhSachGhe(List<GHE> danhSachGhe) {
        this.danhSachGhe = danhSachGhe;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

}
