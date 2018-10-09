package ofedorova.cms.domain.repository;

import ofedorova.cms.domain.models.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, String> {
}
