package feltrimar.project.repositories;

import feltrimar.project.models.Region;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region,Long> {

    @Query("select r from Region r where r.world.id = ?1")
    public List<Region> findByRegion(long id);
}
