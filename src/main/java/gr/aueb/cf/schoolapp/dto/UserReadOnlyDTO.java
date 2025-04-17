package gr.aueb.cf.shoolapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserReadOnlyDTO extends gr.aueb.cf.shoolapp.dto.BaseUserDTO {

    private Integer id;

    public UserReadOnlyDTO() {}

    public UserReadOnlyDTO(Integer id, String username, String password) {
        super(username, password);
        this.id = id;
    }

}
