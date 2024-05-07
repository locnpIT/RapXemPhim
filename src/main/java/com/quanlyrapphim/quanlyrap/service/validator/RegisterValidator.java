package com.quanlyrapphim.quanlyrap.service.validator;

import org.springframework.stereotype.Service;

import com.quanlyrapphim.quanlyrap.domain.dto.registerDTO;
import com.quanlyrapphim.quanlyrap.service.TaiKhoanService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Service
public class RegisterValidator implements ConstraintValidator<RegisterChecked, registerDTO> {

    private final TaiKhoanService taiKhoanService;

    public RegisterValidator(TaiKhoanService taiKhoanService) {
        this.taiKhoanService = taiKhoanService;
    }

    @Override
    public boolean isValid(registerDTO user, ConstraintValidatorContext context) {
        boolean valid = true;

        // Check if password fields match
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            context.buildConstraintViolationWithTemplate("Passwords nhập không chính xác")
                    .addPropertyNode("confirmPassword")
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
            valid = false;
        }

        // Additional validations can be added here
        // check email
        if (this.taiKhoanService.checkEmailExist(user.getEmail())) {
            context.buildConstraintViolationWithTemplate("Email đã tồn tại")
                    .addPropertyNode("email")
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
            valid = false;
        }

        return valid;
    }
}
