package de.ait.city.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="user")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", unique = true)
    private Long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "gender")
    private String gender;

}
