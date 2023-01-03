package feltrimar.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Relation {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "charaOrigin_id")
    private Character charaOrigin;
    @ManyToOne
    @JoinColumn(name = "charaDest_id")
    private Character charaDest;
    private String description;
    private int weight;

    public Relation(Character charaOrigin, Character charaDest, String description, int weight) {
        this.charaOrigin = charaOrigin;
        this.charaDest = charaDest;
        this.description = description;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Character getCharaOrigin() {
        return charaOrigin;
    }

    public void setCharaOrigin(Character charaOrigin) {
        this.charaOrigin = charaOrigin;
    }

    public Character getCharaDest() {
        return charaDest;
    }

    public void setCharaDest(Character charaDest) {
        this.charaDest = charaDest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
