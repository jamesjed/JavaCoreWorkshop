import java.io.*;
import java.util.Scanner;

/**
 * Created by janatana on 9/13/2016.
 */
public class Main {

    public static void main(String[] args){

        FileInputStream file1InStream;
        FileOutputStream file2OutStream;
        boolean validFileOne = false;

        Scanner userInputScanner = new Scanner(System.in);



        // Attempt to read filestream from first inputted file. If the first file does not exist
        // continue to prompt user until a valid file is entered.
        while(true) {
            try {
                System.out.println("Enter first filename");
                String firstFileName = userInputScanner.next();
                File file1 = new File(firstFileName);
                file1InStream = new FileInputStream(firstFileName);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Exception encountered: " + e);
                System.out.println("Re-enter first filename");
            }

        }

        // Attempt to read filestream from second inputted file. If the second file does not exist
        // continue to prompt user until a valid file is entered.
        while(true) {
            try {
                System.out.println("Enter second filename");
                String secondFileName = userInputScanner.next();
                File file2 = new File(secondFileName);
                file2OutStream = new FileOutputStream(secondFileName);
                break;
            } catch (FileNotFoundException | SecurityException e) {
                System.out.println("Exception encountered: " + e);
                System.out.println("Re-enter second filename");
            }
        }

        try{
            byte[] dataBuffer = new byte[1024];

            // Position within stream of bytes being written to the dataBuffer
            // from the input file.
            int position;

            // Read bytes from input stream and write them to byte array
            // 1024 bytes at a time
            while ((position = file1InStream.read(dataBuffer)) != -1)
                // Read bytes from byte array and write to output file stream 1024 bytes at a time
                file2OutStream.write(dataBuffer, 0, position);

            file1InStream.close();
            file2OutStream.close();

        }catch(IOException | NullPointerException e){
            System.out.println("Exception encountered: " + e);
        }

    }

}
