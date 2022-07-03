import java.util.Scanner;

public class 대소문자변환 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        validate(str1);

        StringBuilder stringBuilder = new StringBuilder();

        for (final char c : str1.toCharArray()) {
            if (Character.isUpperCase(c)) {
                Character character = Character.toLowerCase(c);
                stringBuilder.append(character);
                continue;
            }

            Character character = Character.toUpperCase(c);
            stringBuilder.append(character);
        }

        System.out.println(stringBuilder);
    }

    private static void validate(final String str1) {
        if (str1.length() > 100) {
            throw new IllegalArgumentException();
        }
    }
}
