package feltrimar.project.controllers;

import feltrimar.project.models.Character;
import feltrimar.project.services.CharacterService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping
public class CharacterController {
    @Autowired
    private CharacterService cS;

    @GetMapping("/character/region/{id}")
    public List<Character> getCharacterByRegion(@PathVariable long id){
        return cS.getCharacterByRegion(id);
    }

    @GetMapping("/character/detail/{id}")
    public Optional<Character> getCharacterDetail(@PathVariable long id){
        return cS.getCharacterDetail(id);
    }
}
