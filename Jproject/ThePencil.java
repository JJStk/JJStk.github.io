import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThePencil extends FileSpawner {
    public static void main(String[] args) {
        try {
            FileWriter mahPencil = new FileWriter("student.txt");
            mahPencil.write(System.in);
            System.out.println("Written succesfully.")
        } catch (IOException e) {
            System.out.println("Error. I tried." + e.getMessage());
        }
    }
}

// I tried to implement system.in better. I just don't know how to use all the puzzle pieces I have.
// I don't even know if this will work.