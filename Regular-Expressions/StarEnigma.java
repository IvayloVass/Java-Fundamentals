package RegularExpressions_excersise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int messagesNum = Integer.parseInt(sc.nextLine());
        StringBuilder builder = new StringBuilder();

        while (messagesNum > 0) {
            String encryptedMessage = sc.nextLine();
            int symbolAppearances = 0;
            for (int i = 0; i < encryptedMessage.length(); i++) {
                char currentChar = encryptedMessage.charAt(i);
                if (currentChar == 's' || currentChar == 'S'
                        || currentChar == 't' || currentChar == 'T'
                        || currentChar == 'a' || currentChar == 'A'
                        || currentChar == 'r' || currentChar == 'R') {
                    symbolAppearances++;

                }
            }
            for (int i = 0; i < encryptedMessage.length(); i++) {
                char currentChar = (char) (encryptedMessage.charAt(i) - symbolAppearances);
                builder.append(currentChar);
            }
            String regex = "@(?<planetName>[A-Za-z]+)[^@,\\-!:>]*:(?<population>[0-9]+)[^@,\\-!:>]*!(?<attackType>[AD])![^@,\\-!:>]*->(?<soliderCount>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(builder);

            while (matcher.find()) {
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");
                List<String> attacked = new ArrayList<>();
                List<String> destroyed = new ArrayList<>();
                if (attackType.equals("A")) {
                    attacked.add(planetName);
                } else {
                    destroyed.add(planetName);
                }
                Collections.sort(attacked);
                Collections.sort(destroyed);

                attacked.forEach(p -> System.out.println("Attacked planets: " + attacked.size()));
                if (!attacked.isEmpty()) {
                    System.out.println("-> " + planetName);
                }

                destroyed.forEach(p -> System.out.println("Destroyed planets: " + destroyed.size()));
                if (!destroyed.isEmpty()) {
                    System.out.println("-> " + planetName);
                }

                builder.delete(0, builder.length());

                messagesNum--;
            }

        }
    }
}
