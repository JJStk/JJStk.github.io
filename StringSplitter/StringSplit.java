import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class StringSplit {
    
    public static void main(String[] args){

        String LotOfWords = "The quick brown fox jumps over the lazy dog";

        String UsedCut[] = LotOfWords.split(" ");
        List<String> albert = new ArrayList<String>();
        albert = Arrays.asList(UsedCut);

        for(String s: albert){

            System.out.println(s);

        }

    }

}
// One of the first projects I can guarranty has functional code, it works!
// beginnersbook.com gave me the idea to use a for function.
// I wanted this last project so I could compile the data from the file and put it all in rows.
// The last project being reading from a txt file.