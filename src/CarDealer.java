import java.util.HashMap;
import java.util.Scanner;

public class CarDealer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, String> cars = new HashMap<>();
        cars.put("E-class", "Mercedez");
        cars.put("Avalon", "Toyota");
        cars.put("G90", "Genesis");
        cars.put("F150", "Ford");

        System.out.println("What model are you looking for today?");
        System.out.print("> ");
        String desiredModel = input.nextLine();
        String make = cars.get(desiredModel);

        if (make !=null) {
            System.out.printf("oh, you're looking for a %? Our selection is right there over here...\n" ,desiredModel, make);
        } else {
            System.out.printf("Sorry, we don't have any %ss in stock. \n", desiredModel);
        }   

        input.close();
        }
    }