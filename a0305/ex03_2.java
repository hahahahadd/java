package a0305;

import java.util.Scanner;
//alt + shift + o 이용해서 자동으로 라이브러리 불러옴
public class ex03_2 {
    public static void main(String[] args) {
        //실수1개 입력
       System.out.print("실수 한 개 입력하세요: ");
       Scanner sc = new Scanner(System.in);
       float x = sc.nextFloat(); 
       //index 0 한개의 문자만 받아와라
       //System.out.println("입력한 문자는: "+x);
       System.out.printf("입력한 숫자는 %10.2f",x); 

      
    }
}
