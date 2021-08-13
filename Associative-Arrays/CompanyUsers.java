package AssociativeArrays_exersise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, List<String>> companyUsers = new TreeMap<>();
        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];
            if (!companyUsers.containsKey(company)) {
                companyUsers.put(company, new ArrayList<>());
                companyUsers.get(company).add(employeeId);
            } else if (companyUsers.containsKey(company) && !companyUsers.get(company).contains(employeeId)) {
                companyUsers.get(company).add(employeeId);
            }
            input = sc.nextLine();
        }
        companyUsers.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> e.getValue().size()))
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue()
                            .forEach(id -> System.out.println("-- " + id));
                });


    }
}


