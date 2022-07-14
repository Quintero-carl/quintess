package com.quintess.quintess.quintess;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/age")
public class QuintessControllerAge {

    private final QuintessServiceAge quintessServiceAge;

    @Autowired
    public QuintessControllerAge(QuintessServiceAge quintessServiceAge) {
        this.quintessServiceAge = quintessServiceAge;
    }


    @GetMapping
    public Map<Integer, List<Quintess>> getQuintess(){
        return quintessServiceAge.getQuintessAge();
    }


}



