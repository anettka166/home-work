package assignment6_strings;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER SOMETHING: ");
        String input = scanner.nextLine();

        char firstLetter = input.toLowerCase().charAt(0);
        int wordLength = input.length();
        char lastLetter = input.toLowerCase().charAt(wordLength-1);

        if ((firstLetter == 'a'|| firstLetter == 'e' || firstLetter == 'y' || firstLetter == 'i' || firstLetter == 'o'
                || firstLetter == 'u') && (lastLetter == 'a'|| lastLetter == 'e' || lastLetter == 'y'
                || lastLetter == 'i' || lastLetter == 'o' || lastLetter == 'u')){
                System.out.println("YES!");
            }else{
                System.out.println("NO!");
                            }

        }









    }

