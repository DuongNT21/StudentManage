package com.Duongnt.StudentManage.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateAccountRequest {
    private String username;
    private String fullName;
    private String email;
    private String phone;
    private String password;
}
