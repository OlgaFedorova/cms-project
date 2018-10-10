package ofedorova.cms.domain.repository;

import ofedorova.cms.domain.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
