package adventure.adventure.controllers.service;

import adventure.adventure.controllers.exceptions.UserAlreadyExistException;
import adventure.adventure.controllers.interfaces.IUserService;
import adventure.adventure.dto.UserDto;
import adventure.adventure.entities.User;
import adventure.adventure.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Transactional
public class UserService implements IUserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User registerNewUserAccount(UserDto userDto) throws IllegalArgumentException {
        if (emailExists(userDto.getEmail())) {
            throw new IllegalArgumentException("There is an account with that email address: "
                    + userDto.getEmail());
        }

        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setRoles(Arrays.asList("ROLE_USER"));

        return repository.save(user);
    }

    private boolean emailExists(String email) {
        return repository.findByEmail(email) != null;
    }
}