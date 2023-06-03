package adventure.adventure.controllers.interfaces;

import adventure.adventure.dto.UserDto;
import adventure.adventure.entities.User;

public interface IUserService {
    User registerNewUserAccount(UserDto userDto);
}
