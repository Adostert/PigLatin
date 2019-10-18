// @author Brandon Bath and Amber Dostert
package co.grandcircus;
import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pig Translator!");
        System.out.println();
        System.out.println("Please enter a word to be translated:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Alright, let's translate: " + str + ".");
        char userReply = 0;
        do {
        int a = str.length();
        // Position of first vowel
        int taco = 0;
        String str1 = "", str2 = "";
        for (int l = 0; l < str.length(); l++) {
            char ch = str.charAt(l);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                taco = l;
            
            break;
            }
           
        }
        
        str1 = str.substring(0, taco);
        str2 = str.substring(taco, str.length());
        
        System.out.println(str2 + " " + str1 + " " + "ay");
        
        System.out.println("Would you like to go again?");
        userReply = scan.next().charAt(0);
        } while (userReply == 'y');
    if (userReply != 'y');
    System.out.println("Goodbye!");
    }
}
// Prompt user for input word
// Convert each word to lowercase
// If it starts with a vowel, just add "way to the end"
// Use split to take off consonants up to the first vowel, and add to the end
// Reprint out the word with the consonants at the end, and add "ay"
// Ask user if they want to translate another word