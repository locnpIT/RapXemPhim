package com.quanlyrapphim.quanlyrap.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.quanlyrapphim.quanlyrap.domain.PHIM;
import com.quanlyrapphim.quanlyrap.service.PhimService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhimController {

    private final PhimService phimService;

    public PhimController(PhimService phimService) {
        this.phimService = phimService;
    }

    @GetMapping("/admin/phim")
    public String getAllPhimPage(Model model) {

        List<PHIM> listPhim = phimService.getAllPhim();
        model.addAttribute("listPhim", listPhim);
        return "admin/phim/show";
    }

    @GetMapping("/admin/phim/create")
    public String getCreatePhimPage(Model model) {
        model.addAttribute("newPhim", new PHIM());

        return "admin/phim/create";
    }

    @PostMapping("/admin/phim/create")
    public String postCreatePhimPage(Model model, @ModelAttribute("newPhim") PHIM phim) {
        this.phimService.handleSubmit(phim);
        return "redirect:/admin/phim";
    }

    @GetMapping("/admin/phim/{id}")
    public String getDetailPhimPage(Model model, @PathVariable int id) {

        PHIM currentPhim = this.phimService.getPhimByidPhim(id);
        model.addAttribute("id", id);
        model.addAttribute("phim", currentPhim);
        return "admin/phim/detail";
    }

    @GetMapping("/admin/phim/update/{id}")
    public String getUpdatePhimPage(Model model, @PathVariable int id) {

        PHIM currentPhim = this.phimService.getPhimByidPhim(id);
        model.addAttribute("id", id);
        model.addAttribute("newPhim", currentPhim);

        return "admin/phim/update";
    }

    @PostMapping("/admin/phim/update")
    public String postUpdatePhimPage(Model model, @ModelAttribute("newPhim") PHIM phim) {
        PHIM currentPhim = this.phimService.getPhimByidPhim(phim.getIdPhim());
        if (currentPhim != null) {
            currentPhim.setTenPhim(phim.getTenPhim());
            currentPhim.setDaoDien(phim.getDaoDien());
            currentPhim.setDienVien(phim.getDienVien());
            currentPhim.setHinhAnh(phim.getHinhAnh());
            this.phimService.handleSubmit(currentPhim);
        }
        return "redirect:/admin/phim";
    }

    @GetMapping("/admin/phim/delete/{id}")
    public String getDeletePhimPage(Model model, @PathVariable int id) {
        model.addAttribute("id", id);
        model.addAttribute("newPhim", new PHIM());

        return "admin/phim/delete";
    }

    @PostMapping("/admin/phim/delete")
    public String postDeletePhimPage(Model model, @ModelAttribute("newPhim") PHIM phim) {
        this.phimService.deleteById(phim.getIdPhim());
        return "redirect:/admin/phim";
    }

}
