package org.codingdojo.candyshop.repository;

import org.codingdojo.candyshop.model.Quizz;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
public interface ReactiveQuizzRepository extends ReactiveCrudRepository<Quizz, Long> {
    Mono<Quizz> findByName(String name);
}
