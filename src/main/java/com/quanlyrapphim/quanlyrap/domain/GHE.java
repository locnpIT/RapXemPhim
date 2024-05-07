package com.quanlyrapphim.quanlyrap.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "GHE")
public class GHE {

    @Id
    private int idGhe;
    private byte trangThai;

    @ManyToOne
    @JoinColumn(name = "idHangGhe")
    private HANGGHE hangGhe;
    @ManyToOne
    @JoinColumn(name = "idSoGhe")
    private SOGHE soGhe;
    @ManyToOne
    @JoinColumn(name = "idPhong")
    private PHONGCHIEU phongChieu;

    public int getIdGhe() {
        return idGhe;
    }

    public HANGGHE getHangGhe() {
        return hangGhe;
    }

    public void setHangGhe(HANGGHE hangGhe) {
        this.hangGhe = hangGhe;
    }

    public PHONGCHIEU getPhongChieu() {
        return phongChieu;
    }

    public void setPhongChieu(PHONGCHIEU phongChieu) {
        this.phongChieu = phongChieu;
    }

    public void setIdGhe(int idGhe) {
        this.idGhe = idGhe;
    }

    public byte getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(byte trangThai) {
        this.trangThai = trangThai;
    }

    public SOGHE getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(SOGHE soGhe) {
        this.soGhe = soGhe;
    }

}
