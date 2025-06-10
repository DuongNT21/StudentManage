package com.Duongnt.StudentManage.repository;

import com.Duongnt.StudentManage.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
