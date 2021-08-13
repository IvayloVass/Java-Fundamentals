package AssociativeArrays_exersise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, List<String>> forceBook = new HashMap<>();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String forceSide = input.split("\\s+\\|\\s+")[0];
                String forceUser = input.split("\\s+\\|\\s+")[1];
                forceBook.putIfAbsent(forceSide, new ArrayList<>());
                boolean isExist = false;
                for (List<String> list : forceBook.values()) {
                    if (list.contains(forceUser)) {
                        isExist = true;
                    }
                    if (!isExist) {
                        forceBook.get(forceSide).add(forceUser);
                    }
                }
            } else if (input.contains("->")) {
                String forceUser = input.split("\\s+->\\s+")[0];
                String forceSide = input.split("\\s+->\\s+")[1];
                forceBook.entrySet().forEach(entry -> entry.getValue().remove(forceUser));
                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new ArrayList<>());
                } else {
                    forceBook.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!\n", forceUser, forceSide);
                }

            }
            input = sc.nextLine();
        }
        forceBook.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .sorted((n1, n2) -> {
                    int sortedResult = Integer.compare(n2.getValue().size(), n1.getValue().size());
                    if (sortedResult == 0) {
                        sortedResult = n1.getKey().compareTo(n2.getKey());
                    }
                    return sortedResult;

                }).forEach(entry -> {
            System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().sorted().forEach((user) -> System.out.println("! " + user));
        });

//                        Integer.compare(n2.getValue().size(), n1.getValue().size()))
//                .forEach(e -> {
//                    System.out.println("Side: " + e.getKey() + ", Members: " + e.getValue().size());
//                    e.getValue().stream().sorted(String::compareTo)
//                            .forEach((user) -> System.out.println("! " + user));
//                });


    }
}
