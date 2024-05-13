package com.quanlyrapphim.quanlyrap.service;

import java.util.Collections;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.TAIKHOAN;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final TaiKhoanService taiKhoanService;

    public CustomUserDetailsService(TaiKhoanService taiKhoanService) {
        this.taiKhoanService = taiKhoanService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TAIKHOAN user = this.taiKhoanService.getUserByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }

        return new User(
                user.getEmail(),
                user.getMatKhau(),
                Collections.singleton(new SimpleGrantedAuthority("ROLE_" + user.getVaiTro().getLoaiVaiTro())));

    }

}
