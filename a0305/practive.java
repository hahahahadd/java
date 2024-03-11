package a0305;

import java.util.Scanner;

// 세 자리 정수를 입력받아 각 자리의 숫자를 역순으로 출력하는 프로그램을 작성하세요.
// 예: 입력이 123일 경우, 출력은 321을 출력.
public class practive {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("세 자리 정수를 입력하세요: ");
        int number = scanner.nextInt();

        // 각 자리의 숫자를 역순으로 출력하기
        int digit1 = number % 10; // 일의 자리 숫자
        int digit2 = (number / 10) % 10; // 십의 자리 숫자
        int digit3 = number / 100; // 백의 자리 숫자

        System.out.println("입력한 숫자의 역순은 " + digit1 + digit2 + digit3 + "입니다.");
    }
}
