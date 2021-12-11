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
        int first = arr.get(n - 1);
        int second = arr.get(n - 2);

        //최대값의 더해지는 횟수 구하기
        int count = m / (k + 1) * k;
        count += m % (k + 1);

        int result = first * count;
        result += second * (m - count);

        System.out.println(result);
    }

}
