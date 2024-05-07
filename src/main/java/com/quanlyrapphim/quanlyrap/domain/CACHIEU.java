package com.quanlyrapphim.quanlyrap.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CACHIEU")
public class CACHIEU {
    @Id
    private Integer idCaChieu;

    @ManyToOne
    @JoinColumn(name = "idPhong")
    private PHONGCHIEU phongChieu;

    @ManyToOne
    @JoinColumn(name = "idPhim")
    private PHIM phim;

    private Date ngayChieu;
    
    @OneToMany(mappedBy = "caChieu")
    private List<VE> listVes;
    


    @Column(columnDefinition = "TIME")
    private LocalTime gioBatDau;

    @Column(columnDefinition = "TIME")
    private LocalTime gioKetThuc;

    public Integer getIdCaChieu() {
        return idCaChieu;
    }

    public void setIdCaChieu(Integer idCaChieu) {
        this.idCaChieu = idCaChieu;
    }

    public PHONGCHIEU getPhongChieu() {
        return phongChieu;
    }

    public void setPhongChieu(PHONGCHIEU phongChieu) {
        this.phongChieu = phongChieu;
    }

    public PHIM getPhim() {
        return phim;
    }

    public void setPhim(PHIM phim) {
        this.phim = phim;
    }

    public Date getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public LocalTime getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(LocalTime gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public LocalTime getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(LocalTime gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    public List<VE> getListVes() {
        return listVes;
    }

    public void setListVes(List<VE> listVes) {
        this.listVes = listVes;
    }

}
