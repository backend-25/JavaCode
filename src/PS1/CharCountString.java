package PS1;

import java.util.HashMap;
import java.util.Scanner;

public class CharCountString {
    public CharCountString() {
    }

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<Character, Integer> table = new HashMap();

        for(char c : input.toCharArray()) {
            table.put(c, (Integer)table.getOrDefault(c, 0) + 1);
        }

        char firstNonRepeatingChar = 0;

        for(char c : input.toCharArray()) {
            if ((Integer)table.get(c) == 1) {
                firstNonRepeatingChar = c;
                break;
            }
        }

        if (firstNonRepeatingChar != 0) {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No unique character found.");
        }

    }
}
