package org.codingdojo.candyshop.model;

import java.util.List;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 28/12/2016
 */
public final class PlayerBuilder {
    private String login;
    private List<Response> responses;

    private PlayerBuilder() {
    }

    public static PlayerBuilder aPlayer() {
        return new PlayerBuilder();
    }

    public PlayerBuilder login(String login) {
        this.login = login;
        return this;
    }

    public PlayerBuilder responses(List<Response> responses) {
        this.responses = responses;
        return this;
    }

    public Player build() {
        Player player = new Player();
        player.setLogin(login);
        player.setResponses(responses);
        return player;
    }
}
