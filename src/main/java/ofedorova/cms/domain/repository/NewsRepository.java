package ofedorova.cms.domain.repository;

import ofedorova.cms.domain.models.News;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface NewsRepository extends ReactiveMongoRepository<News, String> {
}
