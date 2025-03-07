import java.io.*;
import java.util.Scanner;

public class TheQuillOfV {
    public static void main(String[] args) {
        Scanner EyeOfV = new Scanner(System.in);

        System.out.println("Fill out the following:");

        String[] inputs = new String[5];

        System.out.print("Your name: ");
        inputs[0] = EyeOfV.nextLine();
        System.out.print("Your favorite book: ");
        inputs[1] = EyeOfV.nextLine();
        System.out.print("Your favorite sport: ");
        inputs[2] = EyeOfV.nextLine();
        System.out.print("Your favorite hobby: ");
        inputs[3] = EyeOfV.nextLine();
        System.out.print("Your favorite coding language: ");
        inputs[4] = EyeOfV.nextLine();

        try {
            BufferedWriter writah = new BufferedWriter(new FileWriter("The_Five.txt"));
            for (String input : inputs) {
                writah.write(input);
                writah.newLine();
            }
            writah.close();
            System.out.println("Your inputs are now stored in the Codex.");
        } catch (IOException e) {
            System.out.println("Error, The Codex could not accept your answer.");
            e.printStackTrace();
        }

        try {
            BufferedReader reeder = new BufferedReader(new FileReader("The_Five.txt"));
            System.out.println("\nYour Codex entries: ");
            String line;
            while ((line = reeder.readLine()) != null) {
                System.out.println(line);
            }
            reeder.close();
        } catch (IOException e) {
            System.out.println("The Codex chose to forget your entries.");
            e.printStackTrace();
        }

        EyeOfV.close();

    }



}