package gr.aueb.cf.schoolapp.mapper;

import gr.aueb.cf.schoolapp.core.RoleType;
import gr.aueb.cf.schoolapp.dto.*;
import gr.aueb.cf.schoolapp.model.Teacher;
import gr.aueb.cf.schoolapp.model.User;

import java.util.Optional;

public class Mapper {

    private Mapper() {}

    public static Teacher mapTeacherInsertToModel(TeacherInsertDTO dto) {
        return new Teacher(null, dto.getFirstname(), dto.getLastname(), dto.getVat(),
                dto.getFathername(), dto.getPhoneNum(), dto.getEmail(), dto.getStreet(), dto.getStreetNum(),
                dto.getZipCode(), dto.getCityId(), null, null, null);
    }

    public static Teacher mapTeacherUpdateToModel(TeacherUpdateDTO dto) {
        return new Teacher(dto.getId(), dto.getFirstname(), dto.getLastname(), dto.getVat(),
                dto.getFathername(), dto.getPhoneNum(), dto.getEmail(), dto.getStreet(), dto.getStreetNum(),
                dto.getZipCode(), dto.getCityId(), null, null, null);
    }

    public static Optional<TeacherReadOnlyDTO> mapTeacherToReadOnlyDTO(Teacher teacher) {
        if (teacher == null) return Optional.empty();
        return Optional.of(new TeacherReadOnlyDTO(teacher.getFirstname(), teacher.getLastname(), teacher.getVat(), teacher.getFatherName(), teacher.getPhoneNum(), teacher.getEmail(), teacher.getStreet(),
                teacher.getStreetNum(), teacher.getZipCode(), teacher.getCityId(), teacher.getId(), teacher.getUuid()));
    }

    public static UserReadOnlyDTO mapToReadOnlyDTO(User user) {
        return new UserReadOnlyDTO(user.getId(), user.getUsername(), user.getPassword());
    }

    public static User mapToUser(InsertUserDTO dto) {
        return new User(null, dto.getUsername(), dto.getPassword(), RoleType.valueOf(dto.getRole()));
    }

}