import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataBot {
    public static void main(String[] args) {
        String LettFreq = "C:/Users/story/OneDrive/Desktop/Lfrequent/letter_frequncy.csv";
        String line;
        String LettSplit = "\n";

        try (BufferedReader br = new BufferedReader(new FileReader(LettFreq))) {
            while ((line = br.readLine()) != null ) { 
                String[] data = line.split(LettSplit);
                System.out.println("The lines: " + String.join("\n", data));
                
            }
        } catch (IOException e) {
            e.printStackTrace();

// Some notes. The only error currently is that the file cannot be found, which I hope means it should work.
// I don't know why it can't find the file, I used it's exact directory, but otherwise it should work.

        }
    }
}
