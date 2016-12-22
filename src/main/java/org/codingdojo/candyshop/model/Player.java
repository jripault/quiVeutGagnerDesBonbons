package org.codingdojo.candyshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
@Document
public class Player {

    @Id
    private Long id;
    private String login;
    private List<Response> responses;

    public int getScore(){
        return 0;
    }
}
