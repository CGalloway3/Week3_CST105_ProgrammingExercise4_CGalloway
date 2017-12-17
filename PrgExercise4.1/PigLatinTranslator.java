//This is my own work. Chad Galloway
/**  Program: Pig Latin Translator
*    File: PigLatinTranslator.java
*    Summary: Reads text from a file and translates it into Pig Latin.
*    Author: Chad Galloway
*    Date: December 17, 201
**/
package programmingexercise4;

import java.io.File;
import java.util.Scanner;

public class PigLatinTranslator {

    public static void main(String[] args) throws Exception {
        // Initialize variables
        File file = new File(System.getProperty("user.dir") + "\\inputFile.txt");
        Scanner fileInput = new Scanner(file);
        String text = "";
        String pigLatinText = "";
        
        while (fileInput.hasNext()){ //loop through words in the file.
            text = fileInput.next();
            if ( VowelChecker( text.substring(0, 1) ) ){ // Check for vowel in first position
                pigLatinText = text + "way";
            }
            else if ( VowelChecker( text.substring(1, 2) ) ){ // Check for vowel in second position
                pigLatinText = text.substring(1) + text.substring(0, 1) + "ay";
            }
            else if ( VowelChecker( text.substring(2, 3) ) ){ // Check for vowel in third position
                pigLatinText = text.substring(2) + text.substring(0, 2) + "ay";
            }
            else if ( VowelChecker( text.substring(3, 4) ) ){ // Check for vowel in fourth position
                pigLatinText = text.substring(3) + text.substring(0, 3) + "ay";
            }
            
            System.out.println(text + "\t" + pigLatinText.toUpperCase());
        }
        
    }
    
    public static boolean VowelChecker(String v){
        if ( v.equalsIgnoreCase("a") ) return true;
        if ( v.equalsIgnoreCase("e") ) return true;
        if ( v.equalsIgnoreCase("i") ) return true;
        if ( v.equalsIgnoreCase("o") ) return true;
        if ( v.equalsIgnoreCase("u") ) return true;
        
        return false;
    }

}
