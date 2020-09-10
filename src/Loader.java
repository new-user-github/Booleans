
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 1000; // g
        int eggsCount = 10; // items
        int sugarAmount = 1000; // g
        int oilAmount = 500; // ml
        int appleCount = 8;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("You can make Pancakes");
        } else {
            System.out.println("there are not enough ingredients for Pancakes");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if (powderAmount >= 5 && milkAmount >= 300 && eggsCount >= 5) {
            System.out.println("You can make Omelette");
        } else {
            System.out.println("there are not enough ingredients for Omelette");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("You can make Apple pie");
        } else {
            System.out.println("There are not enough ingredients for Apple pie");
        }
        if(milkAmount <= (1000 + 300 + 100) || powderAmount <= (400 + 5 + 300) || eggsCount
         <= (5 + 4) || sugarAmount <= 10 || oilAmount <= 30 || appleCount <= 3) {
            System.out.println("But not together");
        }
    }
}