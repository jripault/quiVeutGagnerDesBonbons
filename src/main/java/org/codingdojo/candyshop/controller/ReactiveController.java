package org.codingdojo.candyshop.controller;

import org.codingdojo.candyshop.model.Quizz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
@RestController
@RequestMapping("reactive")
public class ReactiveController {
    @GetMapping("")
    public Mono<Quizz> getQuizz(){
        Quizz data = new Quizz();
        data.setName("bouh");
        return Mono.just(data);
    }
}
