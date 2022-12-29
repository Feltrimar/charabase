package feltrimar.models;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Power {

    public enum Origin {
        FRAGMENT,
        ARK,
        ETERNA_ARK,
        LEGISM,
        STYLE,
        ANOMALY,
        DIVINE,
        OTHER

    }
    @Id
    private long id;
    private String name;
    private String description;
    private Element element;
    private Origin origin;
    @ManyToOne
    private Character user;

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

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Character getUser() {
        return user;
    }

    public void setUser(Character user) {
        this.user = user;
    }
}
