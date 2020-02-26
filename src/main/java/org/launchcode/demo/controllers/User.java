package org.launchcode.demo.controllers;

import org.launchcode.demo.data.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "user")
public class User {
    private Boolean loggedIn = false;
    public void setLoggedIn(Boolean trueOrFalse) {
        loggedIn = trueOrFalse;
    }
    public Boolean getLoggedIn() {
        return loggedIn;
    }

//    @GetMapping
//    public String renderLogInForm() {
//
//    }

    @PostMapping
    public String determinesSuccessfulLogIn (@RequestParam String username, @RequestParam String password) {
        if(UserData.checkUserNameAndPassword(username,password)) {
            setLoggedIn(true);
        }
        return "redirect:";
    }



}
