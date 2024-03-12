package a0312;

import java.util.Arrays;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("배열의 크기를 입력하세요:");
            int num = sc.nextInt();
            String[] arr = new String[num];
            String[] arr1 = Arrays.copyOf(arr, arr.length+num);

            // 문자열 입력
            for (int i = 0; i < num; i++) {
                System.out.print(i + 1 + "번째 문자열:");
                arr[i] = sc.next();
            }

            // 더 값을 입력할지 여부 확인
            System.out.println("더 값을 입력하시겠습니까?(y/n)");
            String answer = sc.next();

            if (!answer.equals("y")) {
               System.out.println(Arrays.toString(arr));
               break;
            }
        }
    }
}