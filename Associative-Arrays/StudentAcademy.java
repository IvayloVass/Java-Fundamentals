package AssociativeArrays_exersise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsNum = Integer.parseInt(sc.nextLine());
        Map<String, Double> studentsDiary = new LinkedHashMap<>();

        for (int i = 0; i < studentsNum; i++) {
            String studentName = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());
            if (!studentsDiary.containsKey(studentName)) {
                studentsDiary.put(studentName, grade);
            } else {
                int count = 1;
                count++;
                double currentGrade = (studentsDiary.get(studentName) + grade) / count;
                studentsDiary.put(studentName, currentGrade);

            }

        }
        studentsDiary.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .filter(e -> e.getValue() >= 4.5)
                .forEach(e -> System.out.printf("%s -> %.2f\n", e.getKey(), e.getValue()));
    }
}
