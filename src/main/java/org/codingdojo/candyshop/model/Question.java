package org.codingdojo.candyshop.model;

import java.util.Set;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
public class Question {

    private int number;
    private String text;
    Set<Answer> answers;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }
}
