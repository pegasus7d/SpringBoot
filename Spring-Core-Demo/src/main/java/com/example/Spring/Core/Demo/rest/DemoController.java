package com.example.Spring.Core.Demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.Core.Demo.common.Coach;

@RestController
public class DemoController {

    //define a private field for the dependency

    private Coach myCoach;


    //define a constructor for dependency injection
    @Autowired
    // public DemoController(Coach theCoach){
    //     myCoach = theCoach;
        
    // }
    public DemoController(@Qualifier("cricketCoach") Coach theCoach){
        myCoach = theCoach;
        
    }


    // @Autowired
    // public void setMyCoach(Coach theCoach){
    //     myCoach = theCoach;
    // }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    
}
