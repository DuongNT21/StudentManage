package com.Duongnt.StudentManage.controller;

import com.Duongnt.StudentManage.dto.requests.CreateAccountRequest;
import com.Duongnt.StudentManage.dto.requests.UpdateAccountRequest;
import com.Duongnt.StudentManage.dto.responses.BaseResponse;
import com.Duongnt.StudentManage.dto.responses.CreateAccountResponse;
import com.Duongnt.StudentManage.dto.responses.UpdateAccountResponse;
import com.Duongnt.StudentManage.entities.Account;
import com.Duongnt.StudentManage.service.interfaces.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/account")
public class AccountController {
    private final IAccountService accountService;

    @PostMapping("/register")
    public ResponseEntity<BaseResponse> register(@RequestBody CreateAccountRequest request) {
        CreateAccountResponse response = accountService.register(request);
        return ResponseEntity.ok(
                new BaseResponse("200", "Success", response)
        );
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<BaseResponse> update(@PathVariable int id, @RequestBody UpdateAccountRequest request) {
        UpdateAccountResponse response = accountService.update(id, request);
        return ResponseEntity.ok(
                new BaseResponse("200", "Success", response)
        );
    }
 }
