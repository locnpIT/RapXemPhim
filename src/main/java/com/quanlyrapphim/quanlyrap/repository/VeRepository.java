package com.quanlyrapphim.quanlyrap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quanlyrapphim.quanlyrap.domain.VE;

@Repository
public interface VeRepository extends JpaRepository<VE, Integer> {

    VE save(VE ve);

    @Query(value = "SELECT * FROM VE WHERE idHoaDon =:idHoaDon", nativeQuery = true)
    List<VE> getListVeByIdHoaDon(@Param("idHoaDon") int idHoaDon);

}
