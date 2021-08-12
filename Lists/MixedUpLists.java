package List_excersise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();

        int smallerSize = Math.min(firstList.size(), secondList.size());
        int firstLeftIndex = 0;
        int secondLeftIndex = 0;

        for (int i = 0; i <= smallerSize - 1; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(smallerSize - 1 - i));
        }
        if (firstList.size() > secondList.size()) {
            firstLeftIndex = firstList.get(firstList.size() - 1);
            secondLeftIndex = firstList.get(firstList.size() - 2);
        } else {
            firstLeftIndex = firstList.get(secondList.size() - 1);
            secondLeftIndex = firstList.get(secondList.size() - 2);
        }

        int intervalStart = Math.min(firstLeftIndex, secondLeftIndex);
        int intervalFinish = Math.max(firstLeftIndex, secondLeftIndex);

        updatedList(intervalStart, intervalFinish, resultList);
        printUpdatedList(resultList);

    }

    private static void printUpdatedList(List<Integer> resultList) {
        for (Integer numbers : resultList) {
            System.out.print(numbers + " ");

        }
    }

    private static void updatedList(int intervalStart, int intervalFinish, List<Integer> resultList) {

        for (int index = 0; index <= resultList.size() - 1; index++) {
            if (resultList.get(index) <= intervalStart || resultList.get(index) >= intervalFinish) {
                resultList.remove(resultList.get(index));
                index = -1;
            }
            Collections.sort(resultList);

        }
    }
}

