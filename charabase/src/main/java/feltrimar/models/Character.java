package feltrimar.models;

import java.util.List;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Character {

    @Id
    private long id;
    private String name;
    private String surname;
    private int age;
    private String description;
    private String image;
    private Element mainElement;
    private Side side;
    private String allegiance;
    @OneToMany
    private List<Power> powers;
    @ManyToOne
    private Region region;

    public Character(String name, String surname, int age, String description) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.description = description;
    }

    public Character(String name, String surname, int age, String description, Element mainElement, Side side,
            String allegiance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.description = description;
        this.mainElement = mainElement;
        this.side = side;
        this.allegiance = allegiance;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Element getMainElement() {
        return mainElement;
    }

    public void setMainElement(Element mainElement) {
        this.mainElement = mainElement;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(String allegiance) {
        this.allegiance = allegiance;
    }

    public enum Side {
        GOOD,
        NEUTRAL,
        EVIL
    }
}
