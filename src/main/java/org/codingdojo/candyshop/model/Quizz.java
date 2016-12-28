package org.codingdojo.candyshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
@Document(collection = "quizzes")
public class Quizz {

    @Id
    private String id;
    private String name;
    private List<Question> questions;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
