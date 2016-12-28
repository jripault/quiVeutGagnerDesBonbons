package org.codingdojo.candyshop.model;

import java.util.List;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
public class Player {

    private String login;
    private List<Response> responses;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public int getScore(){
        return 0;
    }
}
