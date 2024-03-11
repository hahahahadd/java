package a0311;

import java.util.Arrays;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력해주세요");
        String num = sc.nextLine();
        String [] array = num.split("");

        for(int i = 0; i<array.length; i++){
            if(i > 6){
                array[i] = "*";
            }
            System.out.print(array[i]);
        }
       
        
    }
}
