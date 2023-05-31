package de.ait.city.repository;

import de.ait.city.entity.City;
import de.ait.city.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
