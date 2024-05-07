package com.quanlyrapphim.quanlyrap.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.hibernate.sql.ast.tree.from.MappedByTableGroup;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "HOADON")
public class HOADON {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHoaDon;

    @ManyToOne
    @JoinColumn(name = "idTaiKhoan")
    private TAIKHOAN taiKhoan;

    @OneToMany(mappedBy = "hoaDon")
    private List<VE> listVes;

    private LocalDate ngayXuatHoaDon;

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public TAIKHOAN getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TAIKHOAN taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public LocalDate getNgayXuatHoaDon() {
        return ngayXuatHoaDon;
    }

    public void setNgayXuatHoaDon(LocalDate localDate) {
        this.ngayXuatHoaDon = localDate;
    }

    public List<VE> getListVes() {
        return listVes;
    }

    public void setListVes(List<VE> listVes) {
        this.listVes = listVes;
    }

}
