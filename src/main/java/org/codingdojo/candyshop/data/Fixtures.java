package org.codingdojo.candyshop.data;

import org.codingdojo.candyshop.model.*;
import org.codingdojo.candyshop.repository.ReactiveQuizzInstanceRepository;
import org.codingdojo.candyshop.repository.ReactiveQuizzRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
@Component
public class Fixtures {
    private final ReactiveQuizzRepository quizzRepository;
    private final ReactiveQuizzInstanceRepository quizzInstanceRepository;

    public Fixtures(ReactiveQuizzRepository quizzRepository, ReactiveQuizzInstanceRepository quizzInstanceRepository) {
        this.quizzRepository = quizzRepository;
        this.quizzInstanceRepository = quizzInstanceRepository;
    }

    @PostConstruct
    public void init(){
        quizzRepository.deleteAll().subscribe();
        quizzInstanceRepository.deleteAll().subscribe();

        Set<Answer> answers = new HashSet<>();
        answers.add(AnswerBuilder.anAnswer().text("Juju").right(true).build());
        answers.add(AnswerBuilder.anAnswer().text("Julien").right(false).build());
        answers.add(AnswerBuilder.anAnswer().text("Ju").right(false).build());
        List<Question> questions = new ArrayList<>();
        questions.add(QuestionBuilder.aQuestion().number(1).text("Mais qui suis-je ?").answers(answers).build());
        Quizz quizz = QuizzBuilder.aQuizz().name("Third quizz").questions(questions).build();
        quizzRepository.save(quizz).subscribe();

        List<Player> players = new ArrayList<>();
        Player ju = PlayerBuilder.aPlayer().login("Ju").build();
        players.add(ju);
        players.add(PlayerBuilder.aPlayer().login("Ju2").build());
        List<QuestionInstance> questionInstances = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        questionInstances.add(QuestionInstanceBuilder.aQuestionInstance().start(now).end(now.plusSeconds(30)).questionNumber(1).build());


        QuizzInstance quizzInstance = QuizzInstanceBuilder.aQuizzInstance().quizz(quizz).players(players).questions(questionInstances).build();

        quizzInstanceRepository.save(quizzInstance).subscribe();
    }
}
