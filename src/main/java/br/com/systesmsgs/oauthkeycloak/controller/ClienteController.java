package br.com.systesmsgs.oauthkeycloak.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/cliente")
public class ClienteController {

    @GetMapping
    public String cliente(Authentication authentication){
        return "Hello " + authentication.getName();
    }

}
