package feltrimar.models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Relation {

    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name = "charaOrigin_id")
    private Character charaOrigin;
    @ManyToOne
    @JoinColumn(name = "charaDest_id")
    private Character charaDest;
    private String description;
    private int weight;

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
