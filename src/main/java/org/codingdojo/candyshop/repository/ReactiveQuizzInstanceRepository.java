package org.codingdojo.candyshop.repository;

import org.codingdojo.candyshop.model.QuizzInstance;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
public interface ReactiveQuizzInstanceRepository extends ReactiveCrudRepository<QuizzInstance, String> {
}
