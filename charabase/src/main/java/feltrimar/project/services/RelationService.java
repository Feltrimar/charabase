package feltrimar.project.services;

import feltrimar.project.models.Power;
import feltrimar.project.models.Relation;
import feltrimar.project.repositories.PowerRepository;
import feltrimar.project.repositories.RelationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationService {

    @Autowired
    private RelationRepository rR;

    public List<Relation> getAllRelations(){
        return rR.findAll();
    }
}
