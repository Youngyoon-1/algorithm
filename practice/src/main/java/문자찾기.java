import java.util.Scanner;

public class 문자찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char c = scanner.nextLine().charAt(0);

        System.out.println(solution(str, c));
    }

    private static int solution(String str, char c) {
        int answer = 0;

        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer++;
            }
        }

        return answer;
    }
}
