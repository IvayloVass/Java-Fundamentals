package List_excersise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double savings = Double.parseDouble(sc.nextLine());
        List<Integer> drumSet = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> duplicatedDrums = new ArrayList<>();
        String input = sc.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(input);
            int currentDrum = 0;
            int initialDrum = 0;
            for (int index = 0; index < drumSet.size(); index++) {
                duplicatedDrums.add(drumSet.get(index));
                initialDrum = drumSet.get(index);
                currentDrum = drumSet.get(index) - power;
                drumSet.set(index, currentDrum);
                if (drumSet.get(index) <= 0) {
                    if (savings >= initialDrum * 3) {
                        drumSet.set(index, duplicatedDrums.get(index));
                        savings -= duplicatedDrums.get(index) * 3;
                    } else {
                        drumSet.remove(drumSet.get(index));
                    }
                }
            }

            input = sc.nextLine();
        }
        for (Integer drums : drumSet) {
            System.out.print(drums + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);

    }
}
