package a0306;

import java.util.Scanner;

public class sol41 {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if((score<=40 && 30<=score)||(score<=70 && 60<=score )){
            System.out.println("win");
        }else{System.out.println("lose");}
    }
}
