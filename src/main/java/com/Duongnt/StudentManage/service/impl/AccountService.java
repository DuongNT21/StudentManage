package com.Duongnt.StudentManage.service.impl;

import com.Duongnt.StudentManage.dto.requests.CreateAccountRequest;
import com.Duongnt.StudentManage.dto.requests.UpdateAccountRequest;
import com.Duongnt.StudentManage.dto.responses.BaseResponse;
import com.Duongnt.StudentManage.dto.responses.CreateAccountResponse;
import com.Duongnt.StudentManage.dto.responses.UpdateAccountResponse;
import com.Duongnt.StudentManage.entities.Account;
import com.Duongnt.StudentManage.entities.Role;
import com.Duongnt.StudentManage.repository.AccountRepository;
import com.Duongnt.StudentManage.service.interfaces.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService {
    private final AccountRepository accountRepository;

    @Override
    public CreateAccountResponse register(CreateAccountRequest request) {
        Account account = new Account();
        CreateAccountResponse response = new CreateAccountResponse();
        account.setUsername(request.getUsername());
        account.setPassword(request.getPassword());
        account.setEmail(request.getEmail());
        account.setFullName(request.getFullName());
        account.setPhone(request.getPhone());
        account.setRole(Role.STUDENT.name());
        account.setActive(true);
        accountRepository.save(account);
        response.setEmail(account.getEmail());
        response.setPhone(account.getPhone());
        response.setUsername(account.getUsername());
        response.setFullName(account.getFullName());
        response.setRole(account.getRole());
        return response;
    }

    @Override
    public UpdateAccountResponse update(int id, UpdateAccountRequest request) {
        Account ac = accountRepository.findById(id).orElse(null);
        ac.setFullName(request.getFullName() == null ? ac.getFullName() : request.getFullName());
        ac.setPhone(request.getPhone() == null ? ac.getPhone() : request.getPhone());
        ac.setPassword(request.getPassword() == null ? ac.getPassword() : request.getPassword());
        ac.setEmail(request.getEmail() == null ? ac.getEmail() : request.getEmail());
        ac.setUsername(request.getUsername() == null ? ac.getUsername() : request.getUsername());
        accountRepository.save(ac);
        UpdateAccountResponse accountResponse = new UpdateAccountResponse();
        accountResponse.setEmail(ac.getEmail());
        accountResponse.setPhone(request.getPhone());
        accountResponse.setFullName(ac.getFullName());
        accountResponse.setUsername(ac.getUsername());
        return accountResponse;
    }
}
