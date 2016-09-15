import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by janatana on 9/15/2016.
 */
public class Main {
    public static void main(String[] args){

        Set<String> wordList = new HashSet<String>();

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Projects\\WordList\\pg1342.txt"));
            String line;

            while((line = bufReader.readLine()) != null){

                // Split the current line into an array of words occuring in the line
                String[] strArray = (line.toLowerCase().split("\\W+"));

                // Store the words into the word array list from the array
                // of words occuring in the current line
                for(int i = 0; i < strArray.length; i++)
                    wordList.add(strArray[i]);
            }

            Iterator wordListIterator = wordList.iterator();
            while (wordListIterator.hasNext()) {
                System.out.println(wordListIterator.next());
            }

            bufReader.close();

        } catch (FileNotFoundException e){
            System.out.printf("Exception encountered %s ", e);
        } catch (IOException e){
            System.out.printf("Exception encountered %s ", e);
        }
    }
}
