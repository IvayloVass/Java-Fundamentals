package List_excersise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeListP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> myList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];
            int element = Integer.parseInt(input.split("\\s+")[1]);
            if (command.equals("Delete")) {
                myList.removeAll(Arrays.asList(element));
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(input.split("\\s+")[2]);
                myList.add(index, element);
            }

            input = sc.nextLine();
        }
        printList(myList);

    }

    private static void printList(List<Integer> myList) {
        for (Integer newList : myList) {
            System.out.print(newList + " ");

        }
    }
}
