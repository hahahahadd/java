package a0306;

import java.util.Scanner;

public class sol37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요:");
        boolean run = true;
        int Num = scanner.nextInt();
        
        for(int i = 0; i < Num; i++){
            System.out.println("*".repeat(Num));
        }

    }
}
