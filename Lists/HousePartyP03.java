package List_excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HousePartyP03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> participants = new ArrayList<>();
        int numOfCommands = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= numOfCommands; i++) {
            String[] input = sc.nextLine().split(" ");
            String participantName = input[0];
            if (input[2].equals("going!")) {
                if (participants.contains(participantName)) {
                    System.out.println(participantName + " is already in the list!");
                } else {
                    participants.add(participantName);
                }
            } else if (input[2].equals("not")) {
                if (participants.contains(participantName)) {
                    participants.remove(participantName);
                } else {
                    System.out.println(participantName + " is not in the list!");
                }
            }

        }
        for (String updatedList : participants) {
            System.out.println(updatedList);
        }
    }
}
