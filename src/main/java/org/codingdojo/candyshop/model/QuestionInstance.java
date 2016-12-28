package org.codingdojo.candyshop.model;

import java.time.LocalDateTime;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
public class QuestionInstance {

    private int questionNumber;
    private LocalDateTime start;
    private LocalDateTime end;
    private int goodAnswers;
    private int totalAnswers;

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public int getGoodAnswers() {
        return goodAnswers;
    }

    public void setGoodAnswers(int goodAnswers) {
        this.goodAnswers = goodAnswers;
    }

    public int getTotalAnswers() {
        return totalAnswers;
    }

    public void setTotalAnswers(int totalAnswers) {
        this.totalAnswers = totalAnswers;
    }
}
