package com.thegreatasia.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class ClientController {
    
    @GetMapping({"/articles/{code}/{url}"})
    public String getiPhonex(@PathVariable("code") String code, @PathVariable("url") String url){
        switch (code) {
            case "ng":
                switch (url) {
                    case "iphone-x":
                        return "/allPosts/iphonex";
                
                    case "iphone-xr":
                        return "/allPosts/iphone-xr";
                    default:
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                }
        
            default:
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
