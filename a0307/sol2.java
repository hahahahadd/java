package a0307;

import java.util.Scanner;

public class sol2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하시오");
        int num1 = scan.nextInt();
        System.out.println("첫번째 숫자를 입력하시오");
        int num2 = scan.nextInt();
        System.out.println("첫번째 숫자를 입력하시오");
        int num3 = scan.nextInt();

        if(num1>=num2 && num3>=num2){
            System.out.println("가장 작은수는"+num2);
        }if(num1>=num3 && num2>=num3){
            System.out.println("가장 작은수는"+num3);
        }if(num2>=num1 && num3>=num1){
            System.out.println("가장 작은수는"+num1);
        }
    }
}
