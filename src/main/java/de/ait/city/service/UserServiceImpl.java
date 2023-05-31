package de.ait.city.service;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.CityResponseDTO;
import de.ait.city.dto.UserRequestDTO;
import de.ait.city.dto.UserResponseDTO;
import de.ait.city.entity.City;
import de.ait.city.entity.User;
import de.ait.city.repository.CityRepository;
import de.ait.city.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl {

    private UserRepository repository;


    public List<UserResponseDTO> getAllUsers() {
        List<UserResponseDTO> list = new ArrayList<>();
        repository.findAll().forEach(
                c -> {
                    UserResponseDTO udto = new UserResponseDTO(
                            c.getId(),
                            c.getFirstName(),
                            c.getLastName(),
                            c.getAge(),
                            c.getGender()
                    );
                    list.add(udto);
                }
        );
        return list;
    }

    public UserResponseDTO addUser(UserRequestDTO user) {
        User u = new User(null, user.getFirstName(), user.getLastName(), user.getAge(), user.getGender());
        repository.save(u);
        UserResponseDTO urdto = new UserResponseDTO();
        return urdto; //??? return c;?
    }

    public UserResponseDTO updateUser(Long id, UserRequestDTO user) {
        User u = new User(null, user.getFirstName(), user.getLastName(), user.getAge(), user.getGender());
        repository.save(u);
        UserResponseDTO urdto = new UserResponseDTO();
        return urdto;
    }

}
