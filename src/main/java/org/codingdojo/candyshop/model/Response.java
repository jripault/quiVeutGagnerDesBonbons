package org.codingdojo.candyshop.model;

import java.time.LocalDateTime;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
public class Response {
    private int questionNumber;
    private int answerNumber;
    private LocalDateTime time;

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public int getAnswerNumber() {
        return answerNumber;
    }

    public void setAnswerNumber(int answerNumber) {
        this.answerNumber = answerNumber;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
