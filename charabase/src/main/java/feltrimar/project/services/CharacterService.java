package feltrimar.project.services;

import feltrimar.project.models.Character;
import feltrimar.project.repositories.CharacterRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository cR;

    public List<Character> getAllCharacters(){
        return cR.findAll();
    }
    public List<Character> getCharacterByRegion(long id)
    {
        return cR.findByRegion(id);
    }

    public Optional<Character> getCharacterDetail(long id)
    {
        return cR.findById(id);
    }
}
