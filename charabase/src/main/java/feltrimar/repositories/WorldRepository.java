package feltrimar.repositories;

import feltrimar.models.World;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorldRepository extends JpaRepository<World,Long> {

}