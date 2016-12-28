package org.codingdojo.candyshop.model;

import java.time.LocalDateTime;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
public final class ResponseBuilder {
    private int questionNumber;
    private int answerNumber;
    private LocalDateTime time;

    private ResponseBuilder() {
    }

    public static ResponseBuilder aResponse() {
        return new ResponseBuilder();
    }

    public ResponseBuilder questionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
        return this;
    }

    public ResponseBuilder answerNumber(int answerNumber) {
        this.answerNumber = answerNumber;
        return this;
    }

    public ResponseBuilder time(LocalDateTime time) {
        this.time = time;
        return this;
    }

    public Response build() {
        Response response = new Response();
        response.setQuestionNumber(questionNumber);
        response.setAnswerNumber(answerNumber);
        response.setTime(time);
        return response;
    }
}
