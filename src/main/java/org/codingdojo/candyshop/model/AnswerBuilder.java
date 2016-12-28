package org.codingdojo.candyshop.model;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
public final class AnswerBuilder {
    private String text;
    private boolean right;

    private AnswerBuilder() {
    }

    public static AnswerBuilder anAnswer() {
        return new AnswerBuilder();
    }

    public AnswerBuilder text(String text) {
        this.text = text;
        return this;
    }

    public AnswerBuilder right(boolean right) {
        this.right = right;
        return this;
    }

    public Answer build() {
        Answer answer = new Answer();
        answer.setText(text);
        answer.setRight(right);
        return answer;
    }
}
