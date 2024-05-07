package com.quanlyrapphim.quanlyrap.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.quanlyrapphim.quanlyrap.domain.GHE;
import com.quanlyrapphim.quanlyrap.service.GheService;

@Controller
public class GheController {

    private final GheService gheService;

    public GheController(GheService gheService) {
        this.gheService = gheService;

    }

    @GetMapping("/admin/ghe")
    public String getGhePage(Model model) {
        List<GHE> listGhe = this.gheService.getAllGhe();

        model.addAttribute("listGhe", listGhe);
        return "admin/ghe/show";
    }

    @GetMapping("/admin/ghe/create")
    public String getCreateGhePage(Model model) {

        model.addAttribute("newGhe", new GHE());
        return "admin/ghe/create";
    }

    @PostMapping("/admin/ghe/create")
    public String postCreateGhePage(Model model, @ModelAttribute("newGhe") GHE ghe) {
        this.gheService.handleSubmitGhe(ghe);
        return "redirect:/admin/ghe";
    }

    @GetMapping("/admin/ghe/delete/{id}")
    public String getDeleteGhePage(Model model, @PathVariable int id) {
        model.addAttribute("id", id);
        model.addAttribute("newGhe", new GHE());
        return "admin/ghe/delete";
    }

    @PostMapping("/admin/ghe/delete")
    public String postDeleteGhePage(Model model, @ModelAttribute("newGhe") GHE ghe) {
        this.gheService.deleteByIdGhe(ghe.getIdGhe());
        return "redirect:/admin/ghe";
    }

}
