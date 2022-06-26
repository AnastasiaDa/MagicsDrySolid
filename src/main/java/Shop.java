import resources.Clothes;
import resources.Footwear;
import resources.Size.ClothesSize;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static resources.Size.ClothesSize.valueOf;

public class Shop {

    static final int minFootSize = 36;
    static final int maxFootSize = 44;

    static Scanner scan = new Scanner(System.in);

    public static void outputMenu(String string) {
        System.out.println("Please enter " + string);
    }

    public static void menu(List<Clothes> clothesList, List<Footwear> footwearList) {

        System.out.println("Hello friend! Welcome to our shop \n");

        while (true) {

            System.out.print("Please choose the point of Menu \n" +
                    "1. Choose clothes by size \n" +
                    "2. Choоse footwear by size \n" +
                    "3. Show all clothes \n" +
                    "4. Show all footwear \n" +
                    "5. Escape from the shop \n");

            String input = scan.nextLine();
            int in = Integer.parseInt(input);

            switch (in) {
                case 1:
                    outputMenu("the size of your clothes \n");
                    ClothesSize clothesSize = ClothesSize.valueOf(scan.nextLine());

                    List<Clothes> clientClothes = new ArrayList<>();

                        for (Clothes clothes : clothesList) {
                            if (clothesSize.equals(clothes.getClothesSize())) {
                                clientClothes.add(clothes);
                                System.out.println(clothes);
                            }
                        }
                    continue;

                case 2:
                    outputMenu("the size of your footwear \n");
                    String inputFootwearSize = scan.nextLine();
                    int footwearSize = Integer.parseInt(inputFootwearSize);
                    List<Footwear> clientFootwear = new ArrayList<>();

                    if (footwearSize >= minFootSize && footwearSize <= maxFootSize) {
                        for (Footwear footwear : footwearList) {
                            if (footwear.getFootSize() == footwearSize) {
                                clientFootwear.add(footwear);
                                System.out.println(footwear);
                            }
                        }
                    } else {
                        System.out.println("We don't have this size of footwear \n");
                    }
                    continue;

                case 3:
                    for (Clothes clothes : clothesList) {
                        System.out.println(clothes);
                    }
                    continue;

                case 4:
                    for (Footwear footwear : footwearList) {
                        System.out.println(footwear);
                    }
                    continue;

                case 5:
                    System.out.println("Bye!");
                    break;
            }
            break;

        }
    }

}
