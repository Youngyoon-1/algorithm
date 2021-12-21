package 구현알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 왕실의나이트 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextLine().charAt(0) - ' ';
        int y = scanner.nextInt();

        int result = 0;

        List<List<Integer>> steps = new ArrayList<>();
        steps.add(Arrays.asList(-2, 1));
        steps.add(Arrays.asList(-2, -1));
        steps.add(Arrays.asList(2, 1));
        steps.add(Arrays.asList(2, -1));
        steps.add(Arrays.asList(-1, 2));
        steps.add(Arrays.asList(1, 2));
        steps.add(Arrays.asList(-1, -2));
        steps.add(Arrays.asList(1, -2));

        for (List<Integer> step : steps) {
            int dx = x + step.get(0);
            int dy = y + step.get(1);
            if (dx >= 1 && dx <= 8 && dy >= 1 && dy <= 8) {
                result++;
            }
        }

        System.out.println(result);
    }
}
