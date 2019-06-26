/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dikushwa
 */
@RestController
@RequestMapping(path="/rest")
public class HelloWorldRest {
    
    @RequestMapping(path="/hello", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }
    
}
