package org.codingdojo.candyshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
@RestController
@RequestMapping("test")
public class Home {
    @GetMapping
    public String home(){
        return "BOUH !!!!";
    }
}
