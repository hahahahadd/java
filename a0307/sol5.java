package a0307;

import java.util.Scanner;

public class sol5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("시간을 입력하세요:");
        int hour = scan.nextInt();
        System.out.print("분을 입력하세요:");
        int minute = scan.nextInt();

        if(minute>=30){
            System.out.println(hour+"시"+(minute-30)+"분 입니다.");
        }else if(minute<30){
            System.out.println((hour-1)+"시"+(minute+30)+"분 입니다.");
        }


    }
}
