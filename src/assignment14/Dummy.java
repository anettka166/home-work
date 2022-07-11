package assignment14;

import java.util.Locale;

public class Dummy {
    public static void main(String[] args) {
      String s =  Dummy.generateVin();
    }
        public static String generateVin(){
            String str = "abcdefghijklmnoprstuwxvyz0123456789";
            String result = "";
            for (int i = 0; i < 17; i++) {
                int random = (int)(Math.random()*(str.length()-0) + 0);
                result+= str.charAt(random);
            }
            return result.toUpperCase();
        }
    }

