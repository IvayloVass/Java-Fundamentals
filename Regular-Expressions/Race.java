package RegularExpressions_excersise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> participants = Arrays.stream(sc.nextLine().split(",\\s+")).collect(Collectors.toList());
        String input = sc.nextLine();
        StringBuilder name = new StringBuilder();
        Map<String, Integer> participantDistances = new LinkedHashMap<>();
        participants.forEach(racer -> participantDistances.put(racer, 0));

        while (!input.equals("end of race")) {
            String regexLetters = "[A-Za-z]+";
            String regexDigits = "\\d+";
            Pattern patternLetters = Pattern.compile(regexLetters);
            Pattern patternDigits = Pattern.compile(regexDigits);
            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()) {
                name.append(matcherLetters.group());
            }
            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }
            if (participantDistances.containsKey(name.toString())) {
                int currentDistance = participantDistances.get(name.toString());
                participantDistances.put(name.toString(), currentDistance + distance);
            }

            input = sc.nextLine();
        }

        List<String> firstTreeNames = participantDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstTreeNames.get(0));
        System.out.println("2nd place: " + firstTreeNames.get(1));
        System.out.println("3rd place: " + firstTreeNames.get(2));

    }
}
