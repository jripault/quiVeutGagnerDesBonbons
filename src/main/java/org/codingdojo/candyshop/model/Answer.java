package org.codingdojo.candyshop.model;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */

public class Answer {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private String text;
    private boolean right;

    public void setText(String text) {
        this.text = text;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public String getText() {
        return text;
    }

    public boolean isRight() {
        return right;
    }
}
