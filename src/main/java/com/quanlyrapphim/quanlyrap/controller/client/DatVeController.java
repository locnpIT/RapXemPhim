package com.quanlyrapphim.quanlyrap.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DatVeController {

    @GetMapping("/HoaDon")
    public String getHoaDonPaeg(Model model) {
        return new String();
    }
    


    
}
