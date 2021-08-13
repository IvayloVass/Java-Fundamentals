package AssociativeArrays_exersise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junkMaterials = new TreeMap<>();
        boolean isObtained = false;

        while (!isObtained) {
            String[] tokens = sc.nextLine().split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if (!keyMaterials.containsKey(material)) {
                        keyMaterials.put(material, quantity);
                    } else {
                        keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    }
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }

                } else {
                    junkMaterials.putIfAbsent(material, 0);
                    junkMaterials.put(material, junkMaterials.get(material) + quantity);
                }

            }
        }
        keyMaterials.entrySet().stream().sorted((q1, q2) -> Integer.compare(q2.getValue(), q1.getValue()))
//                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));

        junkMaterials.keySet().stream().sorted(String::compareTo);
        junkMaterials.entrySet().forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));


    }
}
