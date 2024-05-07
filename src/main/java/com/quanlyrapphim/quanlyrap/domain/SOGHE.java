package com.quanlyrapphim.quanlyrap.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SOGHE")
public class SOGHE {

    @Id
    private int idSoGhe;
    private String soGhe;

    @OneToMany(mappedBy = "soGhe")
    private List<GHE> danhSachGhe;

    public int getIdSoGhe() {
        return idSoGhe;
    }

    public void setIdSoGhe(int idSoGhe) {
        this.idSoGhe = idSoGhe;
    }

    public String getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(String soGhe) {
        this.soGhe = soGhe;
    }

    public List<GHE> getDanhSachGhe() {
        return danhSachGhe;
    }

    public void setDanhSachGhe(List<GHE> danhSachGhe) {
        this.danhSachGhe = danhSachGhe;
    }

}
