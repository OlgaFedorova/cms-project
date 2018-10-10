package ofedorova.cms.domain.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "system_user")
public class User {

    @Id
    String id;

    String identity;

    String name;

    Role role;

}