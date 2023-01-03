package feltrimar.project.services;

import feltrimar.project.models.World;
import feltrimar.project.repositories.WorldRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorldService {

    @Autowired
    private WorldRepository wR;

    public List<World> getWorlds(){
        return wR.findAll();
    }
}
