package List_excersise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayer.size() != 0 && secondPlayer.size() != 0) {
            int numFirstPlayer = firstPlayer.get(0);
            int numSecondPlayer = secondPlayer.get(0);
            if (numFirstPlayer > numSecondPlayer) {
                firstPlayer.add(numFirstPlayer);
                firstPlayer.add(numSecondPlayer);
                firstPlayer.remove(Integer.valueOf(numFirstPlayer));
                secondPlayer.remove(Integer.valueOf(numSecondPlayer));
            } else if (numFirstPlayer < numSecondPlayer) {
                secondPlayer.add(numSecondPlayer);
                secondPlayer.add(numFirstPlayer);
                secondPlayer.remove(Integer.valueOf(numSecondPlayer));
                firstPlayer.remove(Integer.valueOf(numFirstPlayer));
            } else {
                firstPlayer.remove(Integer.valueOf(numFirstPlayer));
                secondPlayer.remove(Integer.valueOf(numSecondPlayer));
            }
        }
        int cardsSumFirstPlayer = 0;
        int cardsSumSecondPlayer = 0;
        for (Integer cards : firstPlayer) {
            cardsSumFirstPlayer += cards;
        }
        for (Integer cards : secondPlayer) {
            cardsSumSecondPlayer += cards;
        }

        if (cardsSumFirstPlayer > cardsSumSecondPlayer) {
            System.out.printf("First player wins! Sum: %d", cardsSumFirstPlayer);

        } else {
            System.out.printf("Second player wins! Sum: %d", cardsSumSecondPlayer);
        }

    }
}
