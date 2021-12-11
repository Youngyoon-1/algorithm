package greedy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 큰수의법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstInput = sc.nextLine();
        String secondInput = sc.nextLine();
        String[] firstArr = firstInput.split(" ");
        int n = Integer.parseInt(firstArr[0]);
        int m = Integer.parseInt(firstArr[1]);
        int k = Integer.parseInt(firstArr[2]);

        List<Integer> arr = Arrays.stream(secondInput.split(" "))
            .map(Integer::parseInt)
            .sorted(Integer::compareTo)
            .collect(Collectors.toList());
        int result = 0;
        int first = arr.get(n - 1);
        int second = arr.get(n - 2);

        while (m != 0) {
            for (int i = 0; i < k; i++) {
                result += first;
                m--;
            }
            result += second;
            m--;
        }
        System.out.println(result);
    }

}
