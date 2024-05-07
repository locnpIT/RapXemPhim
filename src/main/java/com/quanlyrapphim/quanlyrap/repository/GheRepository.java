package com.quanlyrapphim.quanlyrap.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.GHE;
import com.quanlyrapphim.quanlyrap.domain.HANGGHE;

import jakarta.transaction.Transactional;

@Repository
public interface GheRepository extends JpaRepository<GHE, Integer> {
    GHE save(GHE ghe);

    Optional<GHE> findGheByIdGhe(Integer id);

    @Transactional
    @Modifying
    @Query("DELETE FROM GHE g WHERE g.idGhe = :idGhe")
    void deleteByIdGhe(@Param("idGhe") Integer idGhe);

    List<GHE> findGheByHangGhe(HANGGHE hangGhe);

}
