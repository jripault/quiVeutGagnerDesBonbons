package org.codingdojo.candyshop.controller;

import org.codingdojo.candyshop.model.QuizzInstance;
import org.codingdojo.candyshop.repository.ReactiveQuizzInstanceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
@RestController
@RequestMapping("quizzInstance")
public class QuizzInstanceController {
    private final ReactiveQuizzInstanceRepository repository;

    public QuizzInstanceController(ReactiveQuizzInstanceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public Flux<QuizzInstance> getQuizzes(){
        return repository.findAll();
    }
}
