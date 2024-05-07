package com.quanlyrapphim.quanlyrap.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "VE")
public class VE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVe;

    int idGhe;

    @ManyToOne
    @JoinColumn(name = "idCaChieu")
    CACHIEU caChieu;

    @ManyToOne
    @JoinColumn(name = "idHoaDon")
    HOADON hoaDon;

    @ManyToOne
    @JoinColumn(name = "idGiaVe")
    GIAVE giaVe;

    public int getIdVe() {
        return idVe;
    }

    public void setIdVe(int idVe) {
        this.idVe = idVe;
    }

    public int getIdGhe() {
        return idGhe;
    }

    public void setIdGhe(int idGhe) {
        this.idGhe = idGhe;
    }

    public CACHIEU getCaChieu() {
        return caChieu;
    }

    public void setCaChieu(CACHIEU caChieu) {
        this.caChieu = caChieu;
    }

    public HOADON getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HOADON hoaDon) {
        this.hoaDon = hoaDon;
    }

    public GIAVE getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(GIAVE giaVe) {
        this.giaVe = giaVe;
    }

    

}
