package com.karmasoftonline.tm.controller;

import com.karmasoftonline.tm.entity.Tournament;
import com.karmasoftonline.tm.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/tournament")
public class TournamentController {
    @Autowired
    private TournamentRepository tournamentRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam String email) {
        Tournament n = new Tournament();
        n.setName(name);
        n.setEmail(email);
        tournamentRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }
}