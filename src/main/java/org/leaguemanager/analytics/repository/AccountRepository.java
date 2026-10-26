package org.leaguemanager.analytics.repository;
import  org.leaguemanager.analytics.model.AccountSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountRepository extends JpaRepository <AccountSystem, Long> {

    Optional<AccountSystem> findbyUsername(String username);
    Optional<Account> findbyEmail(String email);

    boolean existByUser(String username);
    boolean existByEmail(String email);

}
