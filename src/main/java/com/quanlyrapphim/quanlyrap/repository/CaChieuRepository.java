package com.quanlyrapphim.quanlyrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.CACHIEU;
import java.util.List;

@Repository
public interface CaChieuRepository extends JpaRepository<CACHIEU, Integer> {

    public CACHIEU findByIdCaChieu(Integer idCaChieu);

    @Query(value = "SELECT idPhim FROM CACHIEU c WHERE c.idCaChieu = :idCaChieu", nativeQuery = true)
    public Integer findIdPhimByIdCaChieu(@Param("idCaChieu") Integer idCaChieu);
}
