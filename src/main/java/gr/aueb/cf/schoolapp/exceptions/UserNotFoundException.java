package gr.aueb.cf.schoolapp.exceptions;

import gr.aueb.cf.schoolapp.model.User;

import java.io.Serial;

public class UserNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(User user) {
        super("User with username: " + user.getUsername() + " not found");
    }

    public UserNotFoundException(String s) {
        super(s);
    }
}
