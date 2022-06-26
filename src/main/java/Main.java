import resources.Clothes;
import resources.Footwear;

import java.util.ArrayList;
import java.util.List;

import static resources.Size.ClothesSize.*;
import static resources.Size.ClothesSize.S;
import static resources.Types.ClothesType.*;
import static resources.Types.Color.*;
import static resources.Types.FootwearType.*;

public class Main {

    static Clothes cl0 = new Clothes(DRESS, BLACK, S, 1500);
    static Clothes cl1 = new Clothes(PANTS, BLUE, L, 1000);
    static Clothes cl2 = new Clothes(JACKET, RED, M, 2000);
    static Clothes cl3 = new Clothes(JEANS, BLUE, XS, 1000);
    static Clothes cl4 = new Clothes(SKIRT, GREEN, XL, 800);
    static Clothes cl5 = new Clothes(BLOUSE, YELLOW, M, 500);
    static Clothes cl6 = new Clothes(PULLOVER, WHITE, S, 1300);
    static Clothes cl7 = new Clothes(DRESS, RED, XS, 2000);
    static Clothes cl8 = new Clothes(PANTS, WHITE, M, 1800);
    static Clothes cl9 = new Clothes(JACKET, YELLOW, L, 1000);
    static Clothes cl10 = new Clothes(PANTS, BLUE, L, 1000);
    static Clothes cl11 = new Clothes(BLOUSE, GREEN, XL, 2500);
    static Clothes cl12 = new Clothes(PULLOVER, BLACK, S, 1200);

    static Footwear ft0 = new Footwear(BOOTS, BLACK, 36, 2000);
    static Footwear ft1 = new Footwear(FLATS, RED, 38, 1000);
    static Footwear ft2 = new Footwear(SHOE, YELLOW, 40, 3000);
    static Footwear ft3 = new Footwear(LOAFERS, BLUE, 42, 1500);
    static Footwear ft4 = new Footwear(SNEAKERS, GREEN, 39, 4000);
    static Footwear ft5 = new Footwear(BOOTS, WHITE, 37, 2000);
    static Footwear ft6 = new Footwear(SHOE, BLACK, 41, 2500);
    static Footwear ft7 = new Footwear(FLATS, BLACK, 37, 2300);
    static Footwear ft8 = new Footwear(LOAFERS, WHITE, 43, 3500);
    static Footwear ft9 = new Footwear(BOOTS, GREEN, 44, 1700);
    static Footwear ft10 = new Footwear(SNEAKERS, BLUE, 37, 2500);
    static Footwear ft11 = new Footwear(SHOE, YELLOW, 40, 1900);
    static Footwear ft12 = new Footwear(SNEAKERS, RED, 38, 2700);

    public static void main(String[] args) {
        List<Clothes> stockClothes = new ArrayList<>();

        stockClothes.add(cl0);
        stockClothes.add(cl1);
        stockClothes.add(cl2);
        stockClothes.add(cl3);
        stockClothes.add(cl4);
        stockClothes.add(cl5);
        stockClothes.add(cl6);
        stockClothes.add(cl7);
        stockClothes.add(cl8);
        stockClothes.add(cl9);
        stockClothes.add(cl10);
        stockClothes.add(cl11);
        stockClothes.add(cl12);

        List<Footwear> stockFootwear = new ArrayList<>();

        stockFootwear.add(ft0);
        stockFootwear.add(ft1);
        stockFootwear.add(ft2);
        stockFootwear.add(ft3);
        stockFootwear.add(ft4);
        stockFootwear.add(ft5);
        stockFootwear.add(ft6);
        stockFootwear.add(ft7);
        stockFootwear.add(ft8);
        stockFootwear.add(ft9);
        stockFootwear.add(ft10);
        stockFootwear.add(ft11);
        stockFootwear.add(ft12);

        Shop.menu(stockClothes, stockFootwear);

    }
}
