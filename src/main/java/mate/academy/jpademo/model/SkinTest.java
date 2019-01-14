package mate.academy.jpademo.model;

import javax.persistence.*;

@Entity
@Table(name = "skinTest")
public class SkinTest extends Test {
    @Column
    private String skinColor;

    @Column
    private String fat;

    public SkinTest() {
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return  "SkinTest{" +
                "skinColor='" + skinColor + '\'' +
                ", fat='" + fat + '\'' +
                ", date=" + date +
                '}';
    }
}
