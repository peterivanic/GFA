import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the number of chickens and pigs: ");

        int chickens = scanner.nextInt();
        int pigs = scanner.nextInt();
        int chickensLegs = chickens * 2;
        int pigsLegs = pigs * 4;
        int allLegs = chickensLegs + pigsLegs;

        System.out.println("All count of animals leg is: " + allLegs);

    }
}
