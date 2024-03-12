package a0312;

import java.util.Arrays;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 (-포함):");
        String num = sc.nextLine();

        char[] arr = new char[14];
        for(int i = 0; i<num.length(); i++){
           arr[i] = num.charAt(i);
        }
        char[] copy = arr.clone();
        for(int i = 8; i<copy.length; i++){
            copy[i] = '*';
        }
        System.out.println(copy);
    }
}
