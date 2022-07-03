import java.util.Scanner;

public class 문장속단어 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String answer = "";
        int idx = line.indexOf(' ');

        while (idx != -1) {
            String candidate = line.substring(0, idx);

            if (candidate.length() > answer.length()) {
                answer = candidate;
            }

            line = line.substring(idx + 1);
            idx = line.indexOf(' ');
        }

        if (line.length() > answer.length()) {
            answer = line;
        }

        System.out.println(answer);
    }
}
