package AssociativeArrays_exersise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, List<String>> programList = new HashMap<>();


        while (!input.equals("end")) {
            String courseName = input.split(":")[0];
            String studentName = input.split(":")[1];

            if (!programList.containsKey(courseName)) {
                List<String> names = new ArrayList<>();
                names.add(studentName);
                programList.put(courseName, names);

            } else {
                List<String> names = programList.get(courseName);
                names.add(studentName);
                programList.put(courseName, names);

            }

            input = sc.nextLine();
        }
        programList.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.println(e.getKey().trim() + ": " + e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(student -> System.out.println("--" + student));

                });
    }
}
