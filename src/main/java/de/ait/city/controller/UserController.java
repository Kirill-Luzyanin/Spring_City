package de.ait.city.controller;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.CityResponseDTO;
import de.ait.city.dto.UserRequestDTO;
import de.ait.city.dto.UserResponseDTO;
import de.ait.city.service.CityServiceImpl;
import de.ait.city.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor

@RestController
@RequestMapping("/users")
public class UserController {

    private UserServiceImpl service;

    @GetMapping(value="")
    public List<UserResponseDTO> listUsers (){
        return service.getAllUsers();
    }

    @PostMapping(value="")
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserResponseDTO createUser(@RequestBody UserRequestDTO user){
        return service.addUser(user);
    }

    @PostMapping(value="/{id}")
    public UserResponseDTO upgradeUser(@PathVariable Long id, @RequestBody UserRequestDTO user){
        return service.updateUser(id, user);
    }

}
