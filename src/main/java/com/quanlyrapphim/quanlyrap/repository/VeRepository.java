package com.quanlyrapphim.quanlyrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.VE;

@Repository
public interface VeRepository extends JpaRepository<VE, Integer>{

    VE save(VE ve);
    
    
}
