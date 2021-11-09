package domain;

import java.io.Serializable;

public class FoodDamain implements Serializable {

   private String title,pic,description;
   private Double fee;
   private int numberIdcard;

    public FoodDamain(String title, String pic, String description, Double fee) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
    }

    public FoodDamain(String title, String pic, String description, Double fee, int numberIdcard) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.numberIdcard = numberIdcard;
    }

    public FoodDamain(String title, String pic, Double fee) {
        this.title = title;
        this.pic = pic;
        this.fee = fee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public int getNumberIdcard() {
        return numberIdcard;
    }

    public void setNumberIdcard(int numberIdcard) {
        this.numberIdcard = numberIdcard;
    }
}
