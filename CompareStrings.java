import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // 比较完整字符串
        boolean isEqual = str1.equals(str2);
        System.out.println("The two given strings are equal: " + isEqual);

        // 比较首字符
        char first1 = str1.charAt(0);
        char first2 = str2.charAt(0);
        boolean firstCharEqual = first1 == first2;
        System.out.println("First characters are equal: " + firstCharEqual);

        scanner.close();
    }
}
