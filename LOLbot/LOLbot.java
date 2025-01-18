import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

    Scanner inputScanner = new Scanner(System.in);

    String input = inputScanner.nextLine();

    String greetings = "hello";

    if (input.contains(greetings)) {

        System.out.println(" Greetings fello human");

    } else {

        System.out.println(" At least say hi first.");

    }

    // I wanted to add a funny if statement for integers, but it didn't like int in this specific if statement. 
    // I have these saved as non-project files. I dunno if that is why it won't let me test this, but I can't input commands.
    // I did ask google how I would take my input and make a funny. That's why I added greetings string to detect hello and the if statement.
    // If you get it to work, I hope it's as funny as I thought it was.


    }
}

