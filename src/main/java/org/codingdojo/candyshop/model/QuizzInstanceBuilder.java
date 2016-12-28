package org.codingdojo.candyshop.model;

import java.util.List;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
public final class QuizzInstanceBuilder {
    private String id;
    private Quizz quizz;
    private List<Player> players;
    private List<QuestionInstance> questions;

    private QuizzInstanceBuilder() {
    }

    public static QuizzInstanceBuilder aQuizzInstance() {
        return new QuizzInstanceBuilder();
    }

    public QuizzInstanceBuilder id(String id) {
        this.id = id;
        return this;
    }

    public QuizzInstanceBuilder quizz(Quizz quizz) {
        this.quizz = quizz;
        return this;
    }

    public QuizzInstanceBuilder players(List<Player> players) {
        this.players = players;
        return this;
    }

    public QuizzInstanceBuilder questions(List<QuestionInstance> questions) {
        this.questions = questions;
        return this;
    }

    public QuizzInstance build() {
        QuizzInstance quizzInstance = new QuizzInstance();
        quizzInstance.setId(id);
        quizzInstance.setQuizz(quizz);
        quizzInstance.setPlayers(players);
        quizzInstance.setQuestions(questions);
        return quizzInstance;
    }
}
