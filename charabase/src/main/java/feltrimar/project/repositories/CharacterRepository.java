package feltrimar.project.repositories;

import feltrimar.project.models.Character;
import feltrimar.project.models.Region;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character,Long> {

    @Query("select c from Character c where c.region.id = ?1")
    public List<Character> findByRegion(long id);
}
