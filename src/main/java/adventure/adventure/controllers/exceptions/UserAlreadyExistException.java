package adventure.adventure.controllers.exceptions;

public class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException() {
    }

    public UserAlreadyExistException(String message) {
        super(message);
    }

}
