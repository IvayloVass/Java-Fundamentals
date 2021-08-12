package List_excersise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int wagonMaxCapacity = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            if (command[0].equals("Add")) {
                int extraWagon = Integer.parseInt(command[1]);
                wagons.add(extraWagon);
            } else {
                int extraPassengersPerWagon = Integer.parseInt(command[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentPassengers = wagons.get(i);
                    if (currentPassengers + extraPassengersPerWagon <= wagonMaxCapacity) {
                        wagons.set(i, currentPassengers + extraPassengersPerWagon);
                        break;
                    }
                }
            }
            input = sc.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");

        }
    }
}

