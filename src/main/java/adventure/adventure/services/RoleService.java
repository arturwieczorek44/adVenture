package adventure.adventure.services;

import adventure.adventure.dto.RoleReadModel;
import adventure.adventure.dto.RoleWriteModel;
import adventure.adventure.entities.Role;
import adventure.adventure.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // Tworzenie nowego obiektu Role
    public Role createRole(RoleWriteModel writeModel) {
        Role role = writeModel.toEntity();
        return roleRepository.save(role);
    }

    // Odczytanie wszystkich obiektów Role
    public List<RoleReadModel> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        return roles.stream()
                .map(RoleReadModel::fromEntity)
                .collect(Collectors.toList());
    }

    // Odczytanie obiektu Role o danym id
    public Optional<RoleReadModel> getRoleById(Long id) {
        Optional<Role> role = roleRepository.findById(id);
        return role.map(RoleReadModel::fromEntity);
    }

    // Aktualizacja obiektu Role
    public Role updateRole(Long id, RoleWriteModel writeModel) {
        Role role = writeModel.toEntity();
        role.setId(id);
        return roleRepository.save(role);
    }

    // Usunięcie obiektu Role
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
