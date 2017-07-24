package com.san.accountState;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountStateRepository extends JpaRepository<AccountState, Integer> {

}
