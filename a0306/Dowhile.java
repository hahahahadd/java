package a0306;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        System.out.println("메시지를 입ㄹ력하세요.");
        System.out.println("종료하려면 q를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
      String inpuString;
      do{
        System.out.println(">");
        inpuString = scanner.nextLine();
        System.out.println(inpuString);
      }while(!inpuString.equals("q"));
      System.out.println("프로그램종료");

    }
}
