package ofedorova.cms.domain.vo;

import lombok.Data;
import ofedorova.cms.domain.models.Category;
import ofedorova.cms.domain.models.Tag;

import java.util.Set;

@Data
public class NewsRequest {

    private String title;
    private String content;
    private Set<Category> categories;
    private Set<Tag> tags;
}
