package com.Duongnt.StudentManage.service.interfaces;

import com.Duongnt.StudentManage.dto.requests.CreateAccountRequest;
import com.Duongnt.StudentManage.dto.requests.UpdateAccountRequest;
import com.Duongnt.StudentManage.dto.responses.CreateAccountResponse;
import com.Duongnt.StudentManage.dto.responses.UpdateAccountResponse;

public interface IAccountService {
    public CreateAccountResponse register(CreateAccountRequest account);
    public UpdateAccountResponse update(int id, UpdateAccountRequest account);

}
