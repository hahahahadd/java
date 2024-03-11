package a0311;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        char[] week = {'월','화','수','목','금','토','일'};
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
       if(num >= 1 && num <= 7){
        System.out.println(week[num-1]+"요일입니다.");
       }else{System.out.println("범위에 숫자가 없습니다.");}
    }
    
}
