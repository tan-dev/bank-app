package com.dummybank.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dummybank.bankapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
