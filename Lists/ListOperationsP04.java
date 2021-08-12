package List_excersise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperationsP04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();

        while (!input.equals("End")) {
            boolean isValid = true;
            String[] operations = input.split("\\s+");
            if (operations[0].equals("Add")) {
                int number = Integer.parseInt(operations[1]);
                numbers.add(number);
            } else if (operations[0].equals("Insert")) {
                int number = Integer.parseInt(operations[1]);
                int index = Integer.parseInt(operations[2]);
                if (index < 0 || index > numbers.size() - 1) {
                    System.out.println("Invalid index");
                    isValid = false;
                }
                if (isValid) {
                    numbers.add(index, number);
                }
            } else if (operations[0].equals("Remove")) {
                int index = Integer.parseInt(operations[1]);
                if (index < 0 || index > numbers.size() - 1) {
                    System.out.println("Invalid index");
                    isValid = false;
                }
                if (isValid) {
                    numbers.remove(index);
                }
            } else if (operations[1].equals("left")) {
                int rotations = Integer.parseInt(operations[2]);
                for (int i = 0; i < rotations; i++) {
                    int lastElement = numbers.get(0);
                    numbers.add(lastElement);
                    numbers.remove(0);
                }
            } else if (operations[1].equals("right")) {
                int rotations = Integer.parseInt(operations[2]);
                for (int i = 0; i < rotations; i++) {
                    int firstElement = numbers.get(numbers.size() - 1);
                    numbers.add(0, firstElement);
                    numbers.remove(numbers.size() - 1);
                }

            }
            input = sc.nextLine();
        }

        for (Integer updatedNumbers : numbers) {
            System.out.print(updatedNumbers + " ");

        }
    }
}

