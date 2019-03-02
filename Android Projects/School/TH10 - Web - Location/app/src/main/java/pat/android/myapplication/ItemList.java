package pat.android.myapplication;

public class ItemList {
    private String foodName;
    private String foodLink;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodLink() {
        return foodLink;
    }

    public void setFoodLink(String foodLink) {
        this.foodLink = foodLink;
    }

    public String getFoodLocation() {
        return foodLocation;
    }

    public void setFoodLocation(String foodLocation) {
        this.foodLocation = foodLocation;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    private String foodLocation;
    private  int foodImage;

    public ItemList(){}
    public ItemList(String foodName, String foodLink, String foodLocation, int foodImage) {
        this.foodName = foodName;
        this.foodLink = foodLink;
        this.foodLocation = foodLocation;
        this.foodImage = foodImage;
    }


}
