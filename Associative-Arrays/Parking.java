package AssociativeArrays_exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandsNum = Integer.parseInt(sc.nextLine());
        Map<String, String> parkingReg = new LinkedHashMap<>();

        for (int i = 1; i <= commandsNum; i++) {
            String registrationData = sc.nextLine();
            String command = registrationData.split("\\s+")[0];
            String name = registrationData.split("\\s+")[1];
            if (command.equals("register")) {
                String plateNum = registrationData.split("\\s+")[2];
                if (!parkingReg.containsKey(name)) {
                    parkingReg.put(name, plateNum);
                    System.out.println(name + " registered " + plateNum + " successfully");

                } else {
                    String currentPlateNum = parkingReg.get(name);
                    System.out.println("ERROR: already registered with plate number " + currentPlateNum);

                }
            } else {
                if (parkingReg.containsKey(name)) {
                    parkingReg.remove(name);
                    System.out.printf("%s unregistered successfully\n", name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }

        }
        for (Map.Entry<String, String> entry : parkingReg.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
