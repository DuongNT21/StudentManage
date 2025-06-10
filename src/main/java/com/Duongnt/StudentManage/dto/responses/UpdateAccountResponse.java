package com.Duongnt.StudentManage.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdateAccountResponse {
    private String username;
    private String fullName;
    private String email;
    private String phone;
}
