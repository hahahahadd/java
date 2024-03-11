package a0305;

import java.util.Scanner;

public class ex02_2 {
    public static void main(String[] args) {
        System.out.println("실수를 한개 입력하세요:");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        System.out.printf("입력한 숫자는 %10.2f",x);
    }
}
