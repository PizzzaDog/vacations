package by.andersen.service;

import by.andersen.pojo.Person;
import by.andersen.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Person findById(Long id) {
        return  userRepository.findById(id).get();
    }

    public void createUser(Person person) {
        userRepository.save(person);
    }

}
