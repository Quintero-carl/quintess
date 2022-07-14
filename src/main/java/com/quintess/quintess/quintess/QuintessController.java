package com.quintess.quintess.quintess;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/quintess")
public class QuintessController {

    private final QuintessService quintessService;

    @Autowired
    public QuintessController(QuintessService quintessService) {
        this.quintessService = quintessService;
    }


    @GetMapping
    public Map<Integer, List<Quintess>> getQuintess(){
        return quintessService.getQuintess();
    }
}
