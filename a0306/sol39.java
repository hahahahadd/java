package a0306;

import java.util.Scanner;

public class sol39 {
    public static void main(String[] args) {
        //세 정수가 주어지면 그 중 가장 작은 수를 출력한다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int num = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int num1 = scanner.nextInt();
        System.out.println("세번째 숫자를 입력하세요");
        int num2 = scanner.nextInt();

        if(num>num2 && num1>num2){
            System.out.println("가장 작은 숫자는"+num2);
        }else if(num>num1 && num2>num1){
            System.out.println("가장 작은 숫자는"+num1);
        }else if(num1>num && num2>num){
            System.out.println("가장 작은 숫자는"+num);
        }
    }
}
