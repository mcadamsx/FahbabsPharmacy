package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import respository.TodoRepository;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepo;




}
