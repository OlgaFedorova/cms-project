package ofedorova.cms.domain.repository;

import ofedorova.cms.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
