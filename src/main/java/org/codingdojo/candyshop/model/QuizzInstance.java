package org.codingdojo.candyshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
@Document
public class QuizzInstance {

    @Id
    private String id;

    private Quizz quizz;

    private List<Player> players;

    private List<QuestionInstance> questions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Quizz getQuizz() {
        return quizz;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<QuestionInstance> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionInstance> questions) {
        this.questions = questions;
    }
}
