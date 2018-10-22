package ofedorova.cms.domain.repository;

import ofedorova.cms.domain.models.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
