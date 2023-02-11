package com.example;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("/user")
    public Map<String, Object> user() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        OAuth2User principal = (OAuth2User) authentication.getPrincipal();
        System.out.println("Principal "+principal);
        
        Map<String, Object> answer = new HashMap<>();
        answer.put("name", principal.getAttribute("login"));
        answer.put("avatar_url", principal.getAttribute("avatar_url"));
        answer.put("company", principal.getAttribute("company"));
        return answer;

    }

    @RequestMapping("/user_details")
    public OAuth2User getUserDetails(@AuthenticationPrincipal OAuth2User principal){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return principal;
    }
}
