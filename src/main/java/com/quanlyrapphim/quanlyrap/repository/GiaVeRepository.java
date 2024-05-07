package com.quanlyrapphim.quanlyrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.GIAVE;

@Repository
public interface GiaVeRepository extends JpaRepository<GIAVE, Integer> {

    GIAVE findByIdGiaVe(int idGiaVe);

}
