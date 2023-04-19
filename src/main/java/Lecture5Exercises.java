import org.w3c.dom.CharacterData;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Lecture5Exercises {

    public static char randomChoose() {
        Random random = new Random();
        return (char)(random.nextInt(26) + 'a');
    }



    ////////////////////////////////////////////////////////////////////

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public static String weakPassword(int length) {
        String password = "";
        for (int i = 0; i < length; i++) {
            char c = randomChoose();
            password += c;
        }
        return password;
    }
    ///////////////////////////////////////////////////////////////////////



    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public static String strongPassword(int length) throws Exception {
        StringBuilder strB = new StringBuilder();
        if (length <= 2) throw new Exception();
        try {
            String essen = "1234567890";
            String essen2 = "!@#$%^&*";
            String listOfCharacter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            SecureRandom random = new SecureRandom();
            int randomInt = random.nextInt(essen.length());
            strB.append(essen.charAt(randomInt));
            int randomSpecial = random.nextInt(essen2.length());
            strB.append(essen2.charAt(randomSpecial));
            for (int i = 0; i < length - 2; i++) {
                int randomChar = random.nextInt(listOfCharacter.length());
                strB.append(listOfCharacter.charAt(randomChar));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strB.toString();
    }
    ////////////////////////////////////////////////////////////////////




    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public static boolean isFiboBin(int n) {
        long fibo = fibonacci(n);
        int bin = Integer.parseInt(Integer.toBinaryString((int) fibo));
        int fiboBin = (int) (bin + fibo);
        if (n == fiboBin)
            return true;
        else
            return false;
    }
    public static long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n - 2) + fibonacci(n - 1);
    }
}

