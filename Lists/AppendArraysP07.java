package List_excersise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArraysP07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> myList = Arrays.stream(sc.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(myList);

        System.out.println(myList.toString().replace("[", "")
                .replace("]", "").replaceAll(",", "").trim().
                        replaceAll("\\s+", " "));
    }
}
