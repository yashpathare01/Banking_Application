package in.yp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.yp.main.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long>
{

}
