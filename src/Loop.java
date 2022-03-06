import java.util.ArrayList;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Please input 5 numbers");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d> ", i);
            int num = Integer.parseInt(input.nextLine());
            numbers.add(num);
        }
        
        int sum = 0;
        int product = 1;
        int largest = numbers.get(0);
        int smallest = numbers.get(0);
        for (int num : numbers) {
            sum += num;
            product *= num;
            largest = num > largest ? num : largest;
            smallest = num < smallest ? num : smallest;
        }
        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Product: %d\n", product);
        System.out.printf("Largest: %d\n", largest);
        System.out.printf("Smallest: %d\n", smallest);

        input.close();
    } 
}