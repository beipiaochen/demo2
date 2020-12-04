package demo.controller;

import demo.entity.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Controller
public class UserController {
    @Autowired
    private UserService userServiceImpl;

    @GetMapping(value = "/getUser")
    public ModelMap getUser(){
        ModelMap model = new ModelMap();
        try{
            List<User> userList = userServiceImpl.getUser();
            model.put("result",userList);
            model.put("code","200");
        }catch (Exception e){
            model.put("code","404");
            model.put("result",e.getCause());
        }
        return model;
    }

}
