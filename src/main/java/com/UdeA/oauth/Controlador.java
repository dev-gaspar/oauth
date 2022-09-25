package com.UdeA.oauth;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controlador {

    @GetMapping
    public Object usuarioActual(OAuth2AuthenticationToken token){
        return token.getPrincipal().getAttributes();
    }

}
