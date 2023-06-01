package de.ait.city.repository;

import de.ait.city.entity.City;
import de.ait.city.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
