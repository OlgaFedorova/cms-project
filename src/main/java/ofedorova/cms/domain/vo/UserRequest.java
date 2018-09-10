package ofedorova.cms.domain.vo;

import lombok.Data;
import ofedorova.cms.domain.models.Role;

@Data
public class UserRequest {

    private String identity;
    private String name;
    private Role role;
}
