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
        Map<String, Integer> wordToFreq = new HashMap<String, Integer>();

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(".\\pg1342.txt"));
            String line;

            while((line = bufReader.readLine()) != null){

                // Split the current line into an array of words occurring in the line
                // Ensure the words are lowercase so uniqueness will not be case sensitive
                String[] strArray = (line.toLowerCase().split("\\W+"));

                // Store the words into the wordList set from the array
                // of words occurring in the current line
                for(int i = 0; i < strArray.length; i++){
                    //wordList.add(strArray[i]);
                    if(wordToFreq.containsKey(strArray[i]))
                        wordToFreq.put(strArray[i], wordToFreq.get(strArray[i]) + 1);
                    else
                        wordToFreq.put(strArray[i], 1);
                }

            }

            // Iterate over the wordList set
            /*
            Iterator wordListIterator = wordList.iterator();
            while (wordListIterator.hasNext()) {
                System.out.println(wordListIterator.next());
            } */

            // Make set of keys so we can iterate over them to get
            // the values for printing
            Set<String> hashMapKeys = wordToFreq.keySet();

            // Use the keys to find the values and ultimately
            // print the key value pairs of the word hash map
            Iterator hashMapIt = hashMapKeys.iterator();
            while(hashMapIt.hasNext()){
                Object key = hashMapIt.next();
                System.out.printf("Word %s occurs %d times\n", key, wordToFreq.get(key));
            }


        } catch (FileNotFoundException e){
            System.out.printf("Exception encountered %s ", e);
        } catch (IOException e){
            System.out.printf("Exception encountered %s ", e);
        }
    }
}
