package dio_api_rest.domain.repository;

import dio_api_rest.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    boolean existsByAccountNumber(String accountNumber);
}
