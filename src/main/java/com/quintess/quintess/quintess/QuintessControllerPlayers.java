package com.quintess.quintess.quintess;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping("api/v1/players")
public class QuintessControllerPlayers {

    private final QuintessServicePlayers quintessServicePlayers;


    @Autowired
    public QuintessControllerPlayers(QuintessServicePlayers quintessServicePlayers) {
        this.quintessServicePlayers = quintessServicePlayers;
    }


    @GetMapping
    public Stream<Quintess> getQuintessPlayers(){

        return quintessServicePlayers.getQuintessPlayers();
    }
}
