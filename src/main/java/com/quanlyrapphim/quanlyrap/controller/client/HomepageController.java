package com.quanlyrapphim.quanlyrap.controller.client;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.quanlyrapphim.quanlyrap.ClassRequestBody.SelectedSeat;
import com.quanlyrapphim.quanlyrap.domain.CACHIEU;
import com.quanlyrapphim.quanlyrap.domain.GHE;
import com.quanlyrapphim.quanlyrap.domain.GIAVE;
import com.quanlyrapphim.quanlyrap.domain.HANGGHE;
import com.quanlyrapphim.quanlyrap.domain.HOADON;
import com.quanlyrapphim.quanlyrap.domain.PHIM;
import com.quanlyrapphim.quanlyrap.domain.TAIKHOAN;
import com.quanlyrapphim.quanlyrap.domain.VE;
import com.quanlyrapphim.quanlyrap.domain.dto.registerDTO;
import com.quanlyrapphim.quanlyrap.domain.submit.DatVe;
import com.quanlyrapphim.quanlyrap.repository.HoaDonRepository;
import com.quanlyrapphim.quanlyrap.service.CaChieuService;
import com.quanlyrapphim.quanlyrap.service.GheService;
import com.quanlyrapphim.quanlyrap.service.GiaVeService;
import com.quanlyrapphim.quanlyrap.service.HangGheService;
import com.quanlyrapphim.quanlyrap.service.HoaDonService;
import com.quanlyrapphim.quanlyrap.service.PhimService;
import com.quanlyrapphim.quanlyrap.service.TaiKhoanService;
import com.quanlyrapphim.quanlyrap.service.VeService;
import com.quanlyrapphim.quanlyrap.untils.JsonStringToArray;

@Controller
public class HomepageController {

    private final PhimService phimService;
    private final GheService gheService;
    private final HangGheService hangGheService;
    private final TaiKhoanService taiKhoanService;
    private final HoaDonService hoaDonService;
    private final CaChieuService caChieuService;
    private final GiaVeService giaVeService;
    private final VeService veService;

    public HomepageController(PhimService phimService, GheService gheService, HangGheService hangGheService,
            TaiKhoanService taiKhoanService, HoaDonService hoaDonService, CaChieuService caChieuService,
            GiaVeService giaVeService, VeService veService) {
        this.gheService = gheService;
        this.phimService = phimService;
        this.hangGheService = hangGheService;
        this.taiKhoanService = taiKhoanService;
        this.hoaDonService = hoaDonService;
        this.caChieuService = caChieuService;
        this.giaVeService = giaVeService;
        this.veService = veService;

    }

    @GetMapping("/")
    public String getHomepage(Model model) {
        List<PHIM> listPhim = this.phimService.getAllPhim();
        model.addAttribute("listPhim", listPhim);
        return "client/homepage/show";
    }

    @GetMapping("/phim/{id}")
    public String getOrderPhim(Model model, @PathVariable int id) {

        model.addAttribute("id", id);
        PHIM currentPhim = this.phimService.getPhimByidPhim(id);
        List<CACHIEU> cachieus = this.phimService.getCaChieuByIdPhim(id);
        List<HANGGHE> listHangGhe = this.hangGheService.findAllHangGhe();
        HANGGHE a = new HANGGHE('A', "A");
        HANGGHE b = new HANGGHE('B', "B");
        HANGGHE c = new HANGGHE('C', "C");
        HANGGHE d = new HANGGHE('D', "D");
        HANGGHE e = new HANGGHE('E', "E");
        HANGGHE f = new HANGGHE('F', "F");
        HANGGHE g = new HANGGHE('G', "G");
        HANGGHE h = new HANGGHE('H', "H");
        HANGGHE i = new HANGGHE('I', "I");

        List<GHE> listGheTheoHangGheA = this.gheService.findGheByHangGhe(a);
        List<GHE> listGheTheoHangGheB = this.gheService.findGheByHangGhe(b);
        List<GHE> listGheTheoHangGheC = this.gheService.findGheByHangGhe(c);
        List<GHE> listGheTheoHangGheD = this.gheService.findGheByHangGhe(d);
        List<GHE> listGheTheoHangGheE = this.gheService.findGheByHangGhe(e);
        List<GHE> listGheTheoHangGheF = this.gheService.findGheByHangGhe(f);
        List<GHE> listGheTheoHangGheG = this.gheService.findGheByHangGhe(g);
        List<GHE> listGheTheoHangGheH = this.gheService.findGheByHangGhe(h);
        List<GHE> listGheTheoHangGheI = this.gheService.findGheByHangGhe(i);

        model.addAttribute("phim", currentPhim);
        model.addAttribute("listHangGhe", listHangGhe);
        model.addAttribute("listGheHangA", listGheTheoHangGheA);
        model.addAttribute("listGheHangB", listGheTheoHangGheB);
        model.addAttribute("listGheHangC", listGheTheoHangGheC);
        model.addAttribute("listGheHangD", listGheTheoHangGheD);
        model.addAttribute("listGheHangE", listGheTheoHangGheE);
        model.addAttribute("listGheHangF", listGheTheoHangGheF);
        model.addAttribute("listGheHangG", listGheTheoHangGheG);
        model.addAttribute("listGheHangH", listGheTheoHangGheH);
        model.addAttribute("listGheHangI", listGheTheoHangGheI);
        model.addAttribute("listCaChieu", cachieus);

        for (CACHIEU cachieu : cachieus) {

        }

        return "client/phim/detail";
    }

    @PostMapping("/selectSeat")
    public String selectSeat(Model model, @ModelAttribute("selectedSeat") DatVe listGheChon,
            RedirectAttributes redirectAttributes) {
        System.out.println(listGheChon.getIdGhe());
        int a[] = {};
        String s = listGheChon.getIdCaChieu();
        a = JsonStringToArray.JsonToArray(listGheChon.getIdGhe());

        CACHIEU cachieu = this.caChieuService.getCaChieuByIdCaChieu(Integer.parseInt(s));

        HOADON hoadonNew = new HOADON();
        TAIKHOAN taikhoan = taiKhoanService.getTaiKhoanById("anhprogunnyiu");
        GIAVE giave = this.giaVeService.getGiaVeById(1);

        hoadonNew.setTaiKhoan(taikhoan);
        hoadonNew.setNgayXuatHoaDon(LocalDate.now());
        this.hoaDonService.handleSave(hoadonNew);
        int soVe = 0;
        for (int i : a) {
            soVe++;
            VE ve = new VE();
            ve.setIdGhe(i);
            ve.setCaChieu(cachieu);
            ve.setGiaVe(giave);
            ve.setHoaDon(hoadonNew);
            this.veService.handleSubmit(ve);
        }
        Double tongTien = giave.getGiaVe() * soVe;
        int idPhim = this.caChieuService.getIdPhimByIdCaChieu(Integer.parseInt(s));
        String tenPhim = this.phimService.getTenPhimByIdPhim(idPhim);

        redirectAttributes.addFlashAttribute("tongTien", tongTien);
        redirectAttributes.addFlashAttribute("tenPhim", tenPhim);

        return "redirect:/DatVeThanhCong";
    }

    @GetMapping("/DatVeThanhCong")
    public String getThanhTienPage(Model model) {
        return "client/ThanhToan/show";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("registerUser", new registerDTO());
        return "client/auth/register";
    }

    @PostMapping("/register")
    public String handleRegister(@ModelAttribute("registerUser") registerDTO registerDTO,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "client/auth/register";
        }
        TAIKHOAN taikhoan = this.taiKhoanService.registerDTOToTaikhoan(registerDTO);

        taikhoan.setVaiTro(this.taiKhoanService.getVaiTroByTen("USER"));
        this.taiKhoanService.handleSubmitTaikhoan(taikhoan);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String getLoginPage(Model mode) {
        return "client/auth/login";
    }

    @GetMapping("/access-deny")
    public String getDenyPage() {
        return "client/auth/deny";
    }

}
