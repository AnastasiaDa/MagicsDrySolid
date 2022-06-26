package resources;

import resources.Types.Color;
import resources.Types.FootwearType;

public class Footwear extends Good {

    protected FootwearType footType;
    protected int footSize;

    public Footwear(FootwearType footType, Color color, int footSize, double price) {
        super(price, color);
        this.footType = footType;
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "Footwear " + footType +
                ": " + color +
                ", " + footSize +
                ", price - " + price;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    public FootwearType getFootType() {
        return footType;
    }

    public int getFootSize() {
        return footSize;
    }
}
