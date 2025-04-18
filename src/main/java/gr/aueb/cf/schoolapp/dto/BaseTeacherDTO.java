package gr.aueb.cf.schoolapp.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class BaseTeacherDTO {

    private String firstname;
    private String lastname;
    private String vat;
    private String fathername;
    private String phoneNum;
    private String email;
    private String street;
    private String streetNum;
    private String zipCode;
    private Integer cityId;

    @Override
    public String toString() {
        return "BaseTeacherDTO{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", vat='" + vat + '\'' +
                ", fathername='" + fathername + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", streetNum='" + streetNum + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", cityId=" + cityId +
                '}';
    }
}
