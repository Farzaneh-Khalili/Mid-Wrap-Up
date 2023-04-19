import java.util.*;

public class Lecture6Exercises {

    public static boolean isPrime(int n) {
        for (int i = 2; i< Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> remove(List<Integer> list) {
        ArrayList newList = new ArrayList<>();
        for (Integer element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }


    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public static long calculateEvenSum(int[] arr) {
        long even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even += arr[i];
            }
        }
        return even;
    }
    ///////////////////////////////////////////////////////////////




    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < (arr.length)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
       return arr;
    }
    ///////////////////////////////////////////////////////////////




    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public static double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        int mLen1 = m1[0].length;
        int mlen2 = m2.length;
        double c[][] = new double[m1.length][m2[0].length];
        if (mlen2 != mLen1) throw new RuntimeException();
        try {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    for (int k = 0; k < m2.length; k++) {
                        c[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return c;
    }
    ///////////////////////////////////////////////////////////////




    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> listOfNames = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            listOfNames.add(List.of(names[i]));
        }
        return listOfNames;
    }
    ///////////////////////////////////////////////////////////////




    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> primeFactor = new ArrayList<Integer>();
        for (int i = 2 ; i <= n; i++) {
            if (isPrime(i)) {
                int x = n;
                while (x % i == 0) {
                    primeFactor.add(i);
                    x /= i;
                }
            }
        }
        List<Integer> newListOfInt = remove(primeFactor);
        return newListOfInt;
    }
    ///////////////////////////////////////////////////////////////




    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> words = new ArrayList<String>();
        String edited = line.replaceAll("[?!,]", "");
        for (String value : edited.split(" " )) {
            words.add(value);
        }
        return words;
    }
}
