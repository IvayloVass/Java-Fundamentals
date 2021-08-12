package List_excersise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreatP08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = Arrays.asList(sc.nextLine().split("\\s+"));
        String command = sc.nextLine();

        while (!command.equals("3:1")) {
            String[] action = command.split("\\s+");

            if ("merge".equals(action[0])) {
                int startIndex = Integer.parseInt(action[1]);
                int endIndex = Integer.parseInt(action[2]);

                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;

                    boolean isValidStartIndex = isInsideList(startIndex, input.size());
                    boolean isValidEndIndex = isInsideList(endIndex, input.size());

                    if (isValidStartIndex && isValidEndIndex) {
                        StringBuilder resultMerge = new StringBuilder();
                        for (int index = startIndex; index <= endIndex; index++) {
                            resultMerge.append(input.get(index));
                        }
                        for (int index = startIndex; index <= endIndex; index++) {
                            input.remove(startIndex);
                        }
                        input.add(startIndex, resultMerge.toString());
                    }
                }
            } else if ("divide".equals(action[0])) {
                int index = Integer.parseInt(action[1]);
                int partitions = Integer.parseInt(action[2]);
                String elementForDivide = input.get(index);
                input.remove(index);
                int partElements = elementForDivide.length() / partitions;
                int begin = 0;
                for (int i = 1; i < partitions; i++) {
                    input.add(index, elementForDivide.substring(begin, partElements + begin));
                    index++;
                    begin += partElements;
                }
                input.add(index, elementForDivide.substring(begin));

            }

            command = sc.nextLine();
        }
        System.out.println(String.join("", input));

    }


    private static boolean isInsideList(int index, int size) {
        return index >= 0 && index <= size;
    }


}
