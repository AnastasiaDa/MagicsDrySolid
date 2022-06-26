package resources;

import resources.Types.Color;

public abstract class Good {
    public double price;
    public Color color;

    public Good(double price, Color color) {
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }
}
