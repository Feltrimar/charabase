package feltrimar.models;

import java.util.List;
import javax.persistence.OneToMany;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class World {

    @Id
    private long id;
    private String name;
    private String description;
    @OneToMany
    private List<Region> regions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}
