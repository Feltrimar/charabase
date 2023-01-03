package feltrimar.project.services;

import feltrimar.project.models.Character;
import feltrimar.project.models.Region;
import feltrimar.project.repositories.CharacterRepository;
import feltrimar.project.repositories.RegionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {

    @Autowired
    private RegionRepository rR;

    public List<Region> getAllRegion(){
        return rR.findAll();
    }
    public List<Region> getRegionPerWorld(long id)
    {
        return rR.findByRegion(id);
    }
}
