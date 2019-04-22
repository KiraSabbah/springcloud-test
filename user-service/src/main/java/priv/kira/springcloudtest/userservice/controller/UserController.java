package priv.kira.springcloudtest.userservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.kira.springcloudtest.userservice.entity.User;
import priv.kira.springcloudtest.userservice.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User getById(@PathVariable("id")Long id){
        return userService.findById(id).orElse(null);
    }
}
