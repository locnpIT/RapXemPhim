package com.quanlyrapphim.quanlyrap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.HANGGHE;

@Repository
public interface HangGheRepository extends JpaRepository<HANGGHE, Character> {
    List<HANGGHE> findAll();

    @Query(value = "SELECT idHangGhe FROM GHE WHERE idGhe = :idGhe", nativeQuery = true)
    int findHangGheIdByIdGhe(@Param("idGhe") int idGhe);

}
