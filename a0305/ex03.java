package a0305;

import java.util.Scanner;
//alt + shift + o 이용해서 자동으로 라이브러리 불러옴
public class ex03 {
    public static void main(String[] args) {
        //문자1개 입력
       System.out.print("문자 한 개 입력하세요: ");
       Scanner sc = new Scanner(System.in);
       String x = sc.next(); 
       System.out.println("입력한 문자는: "+x);

    }
}
