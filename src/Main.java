import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome! What is your name?");

        String name;
        Scanner scanner = new Scanner(System.in);

        //Get input to use only once and never again
        name = scanner.nextLine();

        System.out.println("Well, " + name + ", I've got just the number though of for you!");
        System.out.println("Here's the hitch: you have to guess it!");

        boolean quit = false;
        do {
            System.out.println("I have chosen a number! Good luck!");

            Random random = new Random();
            //Generate a random number between 0 and 1000
            int magicNumber = random.nextInt(1001);

            int guess;
            //Loop while the player's guess is wrong
            do {
                guess = scanner.nextInt();
                if (guess > magicNumber + 100)
                    System.out.println("That is way too high!");
                else if (guess < magicNumber - 100)
                    System.out.println("That's way too low!");
                else if (guess > magicNumber)
                    System.out.println("Too high!");
                else if (guess < magicNumber)
                    System.out.println("Too low!");
            } while (guess != magicNumber);
            System.out.println("Congrats! You got it!");

            System.out.println(name + ", would you like to try again? ('y' or 'n')");
            String data;
            do {
                data = scanner.nextLine();
            } while (!Objects.equals(data, "y") && !Objects.equals(data, "n"));
            quit = data.equals("n");
        } while (!quit);
    }
}