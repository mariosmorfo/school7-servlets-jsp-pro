package gr.aueb.cf.schoolapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TeacherUpdateDTO extends BaseTeacherDTO{

    private Integer id;

    public TeacherUpdateDTO(){}

    public TeacherUpdateDTO(String firstname, String lastname, String vat,
                            String fathername, String phoneNum, String email, String street, String streetNum,
                            String zipCode, Integer cityId, Integer id) {
        super(firstname, lastname, vat, fathername, phoneNum, email, street, streetNum, zipCode, cityId);
        this.id = id;
    }

    @Override
    public String toString() {
        return "TeacherUpdateDTO{" +
                "id=" + id +
                '}';
    }
}
