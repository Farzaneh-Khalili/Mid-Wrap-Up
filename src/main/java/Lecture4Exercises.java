import java.util.Scanner;

public class Lecture4Exercises {
    /////////////////////////////////////////////////////////////////

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public static long factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
    ///////////////////////////////////////////////////////////////////////////////////

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public static long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n - 2) + fibonacci(n - 1);
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public static String reverse(String word) {
        String newStr = "";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            newStr = ch + newStr;
        }
       return newStr;
    }
    ////////////////////////////////////////////////////////////////////////////////

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public static boolean isPalindrome(String line) {
        String withoutSpace = line.replaceAll("\s", "");
        String newStr = "";
        char ch;
        String lower = withoutSpace.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            ch = lower.charAt(i);
            newStr = ch + newStr;
        }
        if (newStr.equals(lower))
            return true;
        else
            return false;
    }
    ////////////////////////////////////////////////////////////////////////////////////////

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        char[][] res = new char[len1][len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    res[i][j] = '*';
                }
                else {
                    res[i][j] = ' ';
                }
            }
        }
        return res;
    }
}
