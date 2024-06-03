package com.matwon.fifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/fifa")
public class MatchController {
    @Autowired
    private MatchRepo mrepo;

    @GetMapping("/all")
    public  List<Matches> getMatches(){
        return  mrepo.findAll();
//        StringBuilder a = new StringBuilder();
//        a.append("<h1>Match Results of 2022 World Cup </h1>");
//        for (Matches m : results){
//            a.append(m.toString());
//        }
//        return a.toString();
    }
}
