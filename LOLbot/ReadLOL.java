import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;


public class ReadLOL{
    
    public static void main(String[] args) {

        try (Scanner scatman = new Scanner(Paths.get("DONT_LEAK.txt"))) {

            while (scatman.hasNextLine()) {
              
                String row = scatman.nextLine();
              
                System.out.println(row);  
                


            }
        } catch (Exception e) {

            System.out.println("Dude, fix " + e.getMessage());

        }
    }
}
// This is what I got for now. It will not read DONT_LEAK.txt saying fix it, because of the catch.
// Also, is there a way to print all of the lines in a file, because the ways I found used List<String>
// to get all of the strings and then printed the contents of the list.