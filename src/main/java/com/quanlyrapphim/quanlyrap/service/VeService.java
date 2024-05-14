package com.quanlyrapphim.quanlyrap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.VE;
import com.quanlyrapphim.quanlyrap.repository.VeRepository;

@Service
public class VeService {

    private final VeRepository veRepository;

    public VeService(VeRepository veRepository) {
        this.veRepository = veRepository;
    }

    public VE handleSubmit(VE ve) {
        return this.veRepository.save(ve);
    }

    public List<VE> getVeByIdHoaDon(int idHoaDon) {
        return this.veRepository.getListVeByIdHoaDon(idHoaDon);
    }

}
