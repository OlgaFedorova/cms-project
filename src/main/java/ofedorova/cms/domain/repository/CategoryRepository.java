package ofedorova.cms.domain.repository;

import ofedorova.cms.domain.models.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {

}
