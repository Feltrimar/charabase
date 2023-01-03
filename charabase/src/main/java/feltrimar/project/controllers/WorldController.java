package feltrimar.project.controllers;

import feltrimar.project.models.World;
import feltrimar.project.repositories.CharacterRepository;
import feltrimar.project.repositories.WorldRepository;
import feltrimar.project.services.WorldService;
import java.util.List;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path="/world")
public class WorldController {
    @Autowired
    private WorldService wS;

    @GetMapping
    public List<World> getWorlds(){
        return wS.getWorlds();
    }
}
