package gr.aueb.cf.schoolapp.exceptions;

import java.io.Serial;

public class UserDAOException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public UserDAOException(String s) {
        super(s);
    }
}
