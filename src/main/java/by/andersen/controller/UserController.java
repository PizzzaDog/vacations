package by.andersen.controller;

import by.andersen.pojo.User;
import by.andersen.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam Long id) {
        return userService.findById(id);
    }
    @PostMapping
    public String create(@RequestParam User user) {
        userService.createUser(user);
        return "HEY HO";
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
