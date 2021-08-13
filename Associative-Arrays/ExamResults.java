package AssociativeArrays_exersise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExamResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, Integer> usernamePoints = new TreeMap<>();
        Map<String, Integer> languageSubmissions = new TreeMap<>();


        while (!input.equals("exam finished")) {
            String userName = input.split("-")[0];
            String language = input.split("-")[1];
            if (!language.equals("banned")) {
                int points = Integer.parseInt((input.split("-"))[2]);
                if (!usernamePoints.containsKey("userName")) {
                    usernamePoints.put(userName, points);
                } else {
                    if (usernamePoints.get(userName) < points) {
                        usernamePoints.put(userName, points);
                    }
                }

                if (!languageSubmissions.containsKey(language)) {
                    languageSubmissions.put(language, 1);
                } else {
                    languageSubmissions.put(language, languageSubmissions.get(language) + 1);
                }

            } else {
                usernamePoints.remove(userName);

            }
            input = sc.nextLine();
        }
        System.out.println("Results:");
        usernamePoints.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
        System.out.println("Submissions:");
        languageSubmissions.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

    }
}