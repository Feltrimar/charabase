package feltrimar.project.controllers;

import feltrimar.project.models.Region;
import feltrimar.project.repositories.RegionRepository;
import feltrimar.project.services.RegionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping
public class RegionController {
    @Autowired
    private RegionService rS;

    @GetMapping("/region/world/{id}")
    public List<Region> getRegionByWorld(@PathVariable long id){
        return rS.getRegionPerWorld(id);
    }
}

