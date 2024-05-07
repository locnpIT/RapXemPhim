package com.quanlyrapphim.quanlyrap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.CACHIEU;
import com.quanlyrapphim.quanlyrap.domain.PHIM;

import jakarta.transaction.Transactional;

@Repository
public interface PhimRepository extends JpaRepository<PHIM, Integer> {
    PHIM save(PHIM phim);

    // hai annotation này để viết query theo ý muốn
    @Transactional
    @Modifying
    @Query("DELETE FROM PHIM p WHERE p.idPhim = :idPhim")
    void deleteByIdPhim(@Param("idPhim") int idPhim);

    PHIM getPhimByidPhim(int idPhim);

    @Transactional
    @Query("SELECT c FROM CACHIEU c WHERE c.phim.idPhim = :idPhim")
    List<CACHIEU> findAllCachieusByIdPhim(@Param("idPhim") int idPhim);

    @Query(value = "SELECT tenPhim FROM PHIM p WHERE p.idPhim = :idPhim", nativeQuery = true)
    String getTenPhimByIdPhim(@Param("idPhim") int idPhim);

}
