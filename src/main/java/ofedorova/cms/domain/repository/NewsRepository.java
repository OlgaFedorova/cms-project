package ofedorova.cms.domain.repository;

import ofedorova.cms.domain.models.News;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository<News, String> {
}
