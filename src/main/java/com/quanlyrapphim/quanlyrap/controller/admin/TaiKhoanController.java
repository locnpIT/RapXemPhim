package com.quanlyrapphim.quanlyrap.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.quanlyrapphim.quanlyrap.domain.TAIKHOAN;
import com.quanlyrapphim.quanlyrap.service.TaiKhoanService;

@Controller
public class TaiKhoanController {

    private final TaiKhoanService taiKhoanService;

    public TaiKhoanController(TaiKhoanService taiKhoanService) {
        this.taiKhoanService = taiKhoanService;
    }

    @GetMapping("/admin/user")
    public String getAllTaiKhoanPage(Model model) {

        List<TAIKHOAN> listTaiKhoan = this.taiKhoanService.findAllTaiKhoan();
        model.addAttribute("listTaiKhoan", listTaiKhoan);
        return "admin/user/show";
    }

    @GetMapping("/admin/user/create")
    public String getCreateUserPage(Model model) {
        model.addAttribute("newUser", new TAIKHOAN());
        return "admin/user/create";
    }

    @PostMapping("/admin/user/create")
    public String postCreateUserPage(Model model, @ModelAttribute("newUser") TAIKHOAN taikhoan) {
        taikhoan.setVaiTro(this.taiKhoanService.getVaiTroByTen(taikhoan.getVaiTro().getLoaiVaiTro()));
        this.taiKhoanService.handleSubmitTaikhoan(taikhoan);
        return "redirect:/admin/user";
    }

}
