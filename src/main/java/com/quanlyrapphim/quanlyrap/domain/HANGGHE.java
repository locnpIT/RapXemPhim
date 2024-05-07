package com.quanlyrapphim.quanlyrap.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "HANGGHE")
public class HANGGHE {
    @Id
    private char idHangGhe;
    private String hangGhe;

    @OneToMany(mappedBy = "hangGhe")
    private List<GHE> danhSachGhe;

    public List<GHE> getDanhSachGhe() {
        return danhSachGhe;
    }

    public void setDanhSachGhe(List<GHE> danhSachGhe) {
        this.danhSachGhe = danhSachGhe;
    }

    public char getIdHangGhe() {
        return idHangGhe;
    }

    public void setIdHangGhe(char idHangGhe) {
        this.idHangGhe = idHangGhe;
    }

    public String getHangGhe() {
        return hangGhe;
    }

    public void setHangGhe(String hangGhe) {
        this.hangGhe = hangGhe;
    }

    public HANGGHE() {

    }

    public HANGGHE(char idHangGhe, String hangGhe) {
        this.idHangGhe = idHangGhe;
        this.hangGhe = hangGhe;
    }

}
