package homework10.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
        private static Scanner scn;

        public static void countWords(String sent) {
            
            ArrayList<String> arr = new ArrayList<String>();
            String[] sentarr = sent.split(" ");
            Map<String, Integer> a = new HashMap<String, Integer>();
            for (String word : sentarr) {
                arr.add(word);
            }
            for (String word : arr) {
                int count = Collections.frequency(arr, word);
                a.put(word, count);
            }
            for (String key : a.keySet()) {
                System.out.println(key + " = " + a.get(key));
            }
        }

        public static void main(String[] args) {
            scn = new Scanner(System.in);
            System.out.println("Please enter sentence: example One one one Little dog run Two two two Cats see you Three three three Birds on a tree Four four four Rats on the floor");
            String inp = scn.nextLine();
            countWords(inp);
        }
}
