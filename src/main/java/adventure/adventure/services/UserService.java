package adventure.adventure.services;

import adventure.adventure.dto.UserReadModel;
import adventure.adventure.dto.UserWriteModel;
import adventure.adventure.entities.User;
import adventure.adventure.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Tworzenie nowego obiektu User
    public User createUser(UserWriteModel writeModel) {
        User user = writeModel.toEntity();
        return userRepository.save(user);
    }

    // Odczytanie wszystkich obiektów User
    public List<UserReadModel> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserReadModel::fromEntity)
                .collect(Collectors.toList());
    }

    // Odczytanie obiektu User o danym id
    public Optional<UserReadModel> getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(UserReadModel::fromEntity);
    }

    // Aktualizacja obiektu User
    public User updateUser(Long id, UserWriteModel writeModel) {
        User user = writeModel.toEntity();
        user.setId(id);
        return userRepository.save(user);
    }

    // Usunięcie obiektu User
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

