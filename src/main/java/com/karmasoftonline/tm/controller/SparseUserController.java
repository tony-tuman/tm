package com.karmasoftonline.tm.controller;

import com.karmasoftonline.tm.entity.SparseUser;
import com.karmasoftonline.tm.repository.SparseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/sparseUser")
public class SparseUserController {
    @Autowired
    private SparseUserRepository sparseUserRepository;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<SparseUser> getAllUsers() {
        return sparseUserRepository.findAll();
    }
}
