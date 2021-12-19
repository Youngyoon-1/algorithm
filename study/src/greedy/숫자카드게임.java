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
        int result = 0;
        for (int i = 0; i < scanner.nextInt(); i++) {
            int minNumber = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).min().getAsInt();
            result = Math.max(result, minNumber);
        }

        System.out.println(result);
    }
}
