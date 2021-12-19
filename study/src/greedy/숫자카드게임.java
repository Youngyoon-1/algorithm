package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 숫자카드게임 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] columnAncRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int column = columnAncRow[0];
        List<List<Integer>> allCard = new ArrayList<>();

        for (int i = 0; i < column; i++) {
            allCard.add(Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));
        }

        List<Integer> candidates = new ArrayList<>();
        for (List<Integer> cards : allCard) {
            candidates.add(cards.stream().min(Integer::compareTo).get());
        }

        System.out.println(candidates.stream().max(Integer::compareTo).get());
    }
}
