package org.choongang.member.controllers;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class RequestJoin {

//    private String gid = UUID.randomUUID().toString();

    private String mode = "step1";

    @Email
    private String email;

    private String name;

    private boolean agree; //개인정보 동의 (필수)

    private boolean agree2;  // 개인정보 필수항목에 대한 처리 및 이용(필수)

    private boolean agree3;  // 개인정보 선택항목에 대한 처리 및 이용

    private boolean agree4;  // 개인정보 마케팅 및 광고 활용

    private boolean agree5;  // 개인정보의 위탁

    @Size(min=6)
    private String userId;

    @Size(min=8)
    private String password;

    private String confirmPassword;

    private boolean SMSAgree;

    private boolean EmailAgree;

    @Size(min=10, max=11)
    private String tel;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String birth;

    private String gender;

    private String authority;

}
