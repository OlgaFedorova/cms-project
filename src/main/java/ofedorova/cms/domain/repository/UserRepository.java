package ofedorova.cms.domain.repository;

import ofedorova.cms.domain.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
