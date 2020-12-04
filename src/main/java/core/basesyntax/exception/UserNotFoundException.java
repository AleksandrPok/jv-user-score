package core.basesyntax.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("UserNotFoundException: User with given email doesn't exist");
    }
}
