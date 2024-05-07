package com.quanlyrapphim.quanlyrap.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "GIAVE")
public class GIAVE {

    @Id
    private int idGiaVe;
    private double giaVe;

    @OneToMany(mappedBy = "giaVe")
    private List<VE> listVes;

    public int getIdGiaVe() {
        return idGiaVe;
    }

    public void setIdGiaVe(int idGiaVe) {
        this.idGiaVe = idGiaVe;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public List<VE> getListVes() {
        return listVes;
    }

    public void setListVes(List<VE> listVes) {
        this.listVes = listVes;
    }

}
