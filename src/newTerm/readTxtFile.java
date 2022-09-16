package newTerm;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner.*;

/**
 * https://www.cs.virginia.edu/~jh2jf/courses/cs2130/fall2022/labs/lab03-infotheory-tools.html
 *
 * Create the program
 * Your program should do the following:
 *
 * Read a text file into a string in memory. You should be able to specify different file names each time you run the program.
 * Repeatedly
 * Pick a random index in the middle of the string
 * Display to the user the 50 characters preceding that index (in such a way that they can tell if what you displayed ended in a space character or not)
 * Have the user type a single character
 * Record if that typing was correct
 * After some fixed number of iterations (20 might make sense), display
 * The ratio of correct guesses (e.g., “You got 14 out of 20 guesses correct!”)
 * The estimated bits of entropy per letter of the text, which is (g ÷ r) where g is the total number of guesses made and r is the number that were correct (e.g., 0.5145731728297582 for 14 of 20 correct).
 */
public class readTxtFile {
    public static String loadFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return filePath;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            reader.close();

            String content = stringBuilder.toString();
            return content;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filePath;
    }

    public static Boolean picFile(String file) {
        Random rand = new Random();
//        int n = rand.nextInt(51, file.length()-1);
        int max = file.length() - 1;
        int min = 50;
        int n = rand.nextInt(max) % (max - min + 1) + min;

        System.out.print("The 50 character before the question is: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(file.charAt(n + i - 50));
        }
        System.out.println(" ");
        Scanner in = new Scanner(System.in);
        char ans = in.next().charAt(0);
        boolean res = false;
        if (ans != file.charAt(n)) {
            res = false;
        } else {
            res = true;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        String file = loadFile("/Users/yangqee/Leetcode/src/newTerm/test.txt");
        int count = 0;
        for (int i = 0; i < 20; i++) {
            if (picFile(file) == true) {
                count++;
            }
        }
        System.out.println("You got " + count + " out of 20 guesses correct");

    }
}