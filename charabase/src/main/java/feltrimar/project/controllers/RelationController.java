package feltrimar.project.controllers;

import feltrimar.project.repositories.CharacterRepository;
import feltrimar.project.repositories.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path="/relation")
public class RelationController {
    @Autowired
    private RelationRepository relationRepository;
}
