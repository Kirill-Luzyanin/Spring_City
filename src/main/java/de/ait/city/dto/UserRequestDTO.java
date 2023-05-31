package de.ait.city.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserRequestDTO {

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

}
