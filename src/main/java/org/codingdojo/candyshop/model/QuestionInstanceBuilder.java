package org.codingdojo.candyshop.model;

import java.time.LocalDateTime;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
public final class QuestionInstanceBuilder {
    private int questionNumber;
    private LocalDateTime start;
    private LocalDateTime end;
    private int goodAnswers;
    private int totalAnswers;

    private QuestionInstanceBuilder() {
    }

    public static QuestionInstanceBuilder aQuestionInstance() {
        return new QuestionInstanceBuilder();
    }

    public QuestionInstanceBuilder questionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
        return this;
    }

    public QuestionInstanceBuilder start(LocalDateTime start) {
        this.start = start;
        return this;
    }

    public QuestionInstanceBuilder end(LocalDateTime end) {
        this.end = end;
        return this;
    }

    public QuestionInstanceBuilder goodAnswers(int goodAnswers) {
        this.goodAnswers = goodAnswers;
        return this;
    }

    public QuestionInstanceBuilder totalAnswers(int totalAnswers) {
        this.totalAnswers = totalAnswers;
        return this;
    }

    public QuestionInstance build() {
        QuestionInstance questionInstance = new QuestionInstance();
        questionInstance.setQuestionNumber(questionNumber);
        questionInstance.setStart(start);
        questionInstance.setEnd(end);
        questionInstance.setGoodAnswers(goodAnswers);
        questionInstance.setTotalAnswers(totalAnswers);
        return questionInstance;
    }
}
