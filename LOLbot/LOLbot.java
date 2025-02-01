import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class LOLbot {
    
    public static void main(String[] args) {

    try (Scanner inputScanner = new Scanner(System.in)) {
        
        System.out.println("Your name: ");
        String input = inputScanner.nextLine();

        System.out.println("Your Grade: ");
        String input2 = inputScanner.nextLine();

        System.out.println("Your School: ");
        String input3 = inputScanner.nextLine();


        String greetings = ("James");
        String grade = ("12th grade");
        String school = ("IHLA");
        String HowDare = ("Minico High");

        


        if (input.contains(greetings) && input2.contains(grade) && input3.contains(school)) {

            System.out.println(" Greetings, James");

        } else {

            System.out.println(" Hello, New User");

        } 

        if (input3.contains(HowDare)) {

            System.out.println("How DARE you!");

        } else {

            System.out.println("Good meeting you.");

        }
        

    }

    // 


    }
}

