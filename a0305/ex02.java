package a0305;

import java.util.Scanner;
//alt + shift + o 이용해서 자동으로 라이브러리 불러옴
public class ex02 {
    public static void main(String[] args) {
        //키보드로 한글자 입력받고
        //정수형으로 변수 선언하고, 변수에 값을 저장한후 
        //변수에 저장된값 그대로 출력하기
       System.out.print("정수를 입력하세요: ");
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt(); //한글자의 숫자를 읽어들여 i저장
       System.out.println("입력한 정수는: "+i);

    }
}
