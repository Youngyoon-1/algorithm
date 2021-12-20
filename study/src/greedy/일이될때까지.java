package greedy;

import java.util.Scanner;

public class 일이될때까지 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int resultCount = 0;
        while (true) {
            int target = (n / k) * k;
            resultCount += (n - target);
            n = target;
            if (n < k) {
                break;
            }
            n /= k;
            resultCount++;
        }

        resultCount += (n - 1);
        System.out.println(resultCount);
    }
}
