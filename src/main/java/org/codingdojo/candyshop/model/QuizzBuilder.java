package org.codingdojo.candyshop.model;

import java.util.List;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
public final class QuizzBuilder {
    private String id;
    private String name;
    private List<Question> questions;

    private QuizzBuilder() {
    }

    public static QuizzBuilder aQuizz() {
        return new QuizzBuilder();
    }

    public QuizzBuilder id(String id) {
        this.id = id;
        return this;
    }

    public QuizzBuilder name(String name) {
        this.name = name;
        return this;
    }

    public QuizzBuilder questions(List<Question> questions) {
        this.questions = questions;
        return this;
    }

    public Quizz build() {
        Quizz quizz = new Quizz();
        quizz.setId(id);
        quizz.setName(name);
        quizz.setQuestions(questions);
        return quizz;
    }
}
