package org.codingdojo.candyshop.model;

import java.util.Set;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
public final class QuestionBuilder {
    Set<Answer> answers;
    private int number;
    private String text;

    private QuestionBuilder() {
    }

    public static QuestionBuilder aQuestion() {
        return new QuestionBuilder();
    }

    public QuestionBuilder number(int number) {
        this.number = number;
        return this;
    }

    public QuestionBuilder text(String text) {
        this.text = text;
        return this;
    }

    public QuestionBuilder answers(Set<Answer> answers) {
        this.answers = answers;
        return this;
    }

    public Question build() {
        Question question = new Question();
        question.setNumber(number);
        question.setText(text);
        question.setAnswers(answers);
        return question;
    }
}
