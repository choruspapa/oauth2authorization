package com.example.authorization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/oauth2")
public class AuthorizationController {

    @GetMapping("me")
    public Principal me(Principal principal) {
        return principal;
    }
}
