package ofedorova.cms.domain.models;

import lombok.Data;

@Data
public class Review {

    private String userId;
    private String status;

    public Review(String userId, String status) {
        this.userId = userId;
        this.status = status;
    }
}
