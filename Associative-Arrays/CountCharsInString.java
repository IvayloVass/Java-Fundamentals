package AssociativeArrays_exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> charsCounter = new LinkedHashMap<>();

        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (currentChar == ' ') {
                continue;
            }
            if (!charsCounter.containsKey(currentChar)) {
                charsCounter.put(currentChar, 1);
            } else {
                int counter = charsCounter.get(currentChar);
                counter++;
                charsCounter.put(currentChar, counter);

            }

        }
        for (Map.Entry<Character, Integer> character : charsCounter.entrySet()) {
            System.out.printf("%s -> %d\n", character.getKey(), character.getValue());
        }

    }

}

