package by.andersen.controller;

import by.andersen.pojo.Person;
import by.andersen.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @GetMapping("/user")
    public Person getUser(@RequestParam Long id) {
        return userService.findById(id);
    }
    @PostMapping
    public String create(@RequestParam Person person) {
        userService.createUser(person);
        return "HEY HO";
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
