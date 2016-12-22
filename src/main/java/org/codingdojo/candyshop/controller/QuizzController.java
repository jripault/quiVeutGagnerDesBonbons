package org.codingdojo.candyshop.controller;

import org.codingdojo.candyshop.model.Quizz;
import org.codingdojo.candyshop.repository.ReactiveQuizzRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
@RestController("quizz")
public class QuizzController {
    private final ReactiveQuizzRepository repository;

    public QuizzController(ReactiveQuizzRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public Flux<Quizz> getQuizzes(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Quizz> getQuizz(Long id){
        return repository.findOne(id);
    }
}
