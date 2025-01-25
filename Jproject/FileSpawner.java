import java.io.File;
import java.io.IOException;

public class FileSpawner extends Main {
    public static void main(String[] args) {

        try {
            
            File file = new File("student.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
        
            } else {

System.out.println("File already exists...");

            }
        } catch (IOException e) {
            System.out.println("ERROR. FAILURE!");
            e.printStackTrace();

        }
    }
}

// Dunno if following a W3schools lesson is against the rules, but thats what I'm doing.