package gr.aueb.cf.schoolapp.dto;

public class TeacherInsertDTO extends BaseTeacherDTO{
    public TeacherInsertDTO(String firstname, String lastname,
                            String vat, String fathername, String phoneNum, String email,
                            String street, String streetNum, String zipCode, Integer cityId) {
        super(firstname, lastname, vat, fathername, phoneNum, email, street, streetNum, zipCode, cityId);
    }

    public TeacherInsertDTO() {
    }
}
