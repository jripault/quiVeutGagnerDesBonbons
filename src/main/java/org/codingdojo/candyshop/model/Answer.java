package org.codingdojo.candyshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * User: JRI <julien.ripault@atos.net>
 * Date: 22/12/2016
 */
@Document
public class Answer {

    @Id
    private Long id;

    private boolean isRight;
    //private Question question;
}
