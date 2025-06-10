package com.Duongnt.StudentManage.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateAccountRequest {
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phone;
}
