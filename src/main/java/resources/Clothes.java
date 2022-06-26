package resources;

import resources.Size.ClothesSize;
import resources.Types.ClothesType;
import resources.Types.Color;

public class Clothes extends Good {

    protected ClothesType clothesType;
    protected ClothesSize clothesSize;

    public Clothes(ClothesType clothesType, Color color, ClothesSize clothesSize, double price) {
        super (price, color);
        this.clothesType = clothesType;
        this.clothesSize = clothesSize;
    }

    @Override
    public String toString() {
        return "Clothes " + clothesType +
                ": " + color +
                ", " + clothesSize +
                ", price - " + price;
    }

    public ClothesType getClothesType() {
        return clothesType;
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    public ClothesSize getClothesSize() {
        return clothesSize;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

}
