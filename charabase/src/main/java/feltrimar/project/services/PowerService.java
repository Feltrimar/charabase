package feltrimar.project.services;

import feltrimar.project.models.Character;
import feltrimar.project.models.Power;
import feltrimar.project.repositories.CharacterRepository;
import feltrimar.project.repositories.PowerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowerService {

    @Autowired
    private PowerRepository pR;

    public List<Power> getAllPowers(){
        return pR.findAll();
    }
}
