package by.andersen.repository;

import by.andersen.pojo.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Person, Long> {
}
