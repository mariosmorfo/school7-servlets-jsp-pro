package gr.aueb.cf.schoolapp.dto;

public class TeacherReadOnlyDTO extends BaseTeacherDTO {

    private Integer id;
    private String uuid;

    public TeacherReadOnlyDTO(){}

    public TeacherReadOnlyDTO(String firstname, String lastname, String vat, String fathername, String phoneNum,
                              String email, String street, String streetNum, String zipCode, Integer cityId, Integer id, String uuid) {
        super(firstname, lastname, vat, fathername, phoneNum, email, street, streetNum, zipCode, cityId);
        this.id = id;
        this.uuid = uuid;
    }

    public TeacherReadOnlyDTO(Integer id, String uuid) {
        this.id = id;
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "TeacherReadOnlyDTO{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
