package com.quanlyrapphim.quanlyrap.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PHIM")
public class PHIM {

    @Id
    private int idPhim;

    private String tenPhim;
    private String noiDung;
    private int thoiLuong;
    private String ngonNgu;
    private String daoDien;
    private String dienVien;
    private String gioiHanTuoi;
    private Date ngayKhoiChieu;
    private Date ngayKetThuc;
    private String trailer;
    private String hinhAnh;

    @OneToMany(mappedBy = "phim")
    private List<CACHIEU> danhSachCaChieu;

    public int getIdPhim() {
        return idPhim;
    }

    public void setIdPhim(int idPhim) {
        this.idPhim = idPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public String getDienVien() {
        return dienVien;
    }

    public void setDienVien(String dienVien) {
        this.dienVien = dienVien;
    }

    public String getGioiHanTuoi() {
        return gioiHanTuoi;
    }

    public void setGioiHanTuoi(String gioiHanTuoi) {
        this.gioiHanTuoi = gioiHanTuoi;
    }

    public Date getNgayKhoiChieu() {
        return ngayKhoiChieu;
    }

    public void setNgayKhoiChieu(Date ngayKhoiChieu) {
        this.ngayKhoiChieu = ngayKhoiChieu;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public List<CACHIEU> getDanhSachCaChieu() {
        return danhSachCaChieu;
    }

    public void setDanhSachCaChieu(List<CACHIEU> danhSachCaChieu) {
        this.danhSachCaChieu = danhSachCaChieu;
    }

}
