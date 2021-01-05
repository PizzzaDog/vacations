package by.andersen.service;

import by.andersen.pojo.User;
import by.andersen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return  userRepository.findById(id).get();
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

}
