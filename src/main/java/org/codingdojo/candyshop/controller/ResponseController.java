package org.codingdojo.candyshop.controller;

import org.codingdojo.candyshop.model.Quizz;
import org.codingdojo.candyshop.repository.ReactiveResponseRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
@RestController
@RequestMapping("response")
public class ResponseController {
    private final ReactiveResponseRepository repository;

    public ResponseController(ReactiveResponseRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/user/{userId}")
    public Mono<Quizz> addResponse(@PathVariable String userId){
        return repository.findById(userId);
    }
}
