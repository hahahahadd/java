package a0312;

import java.util.Arrays;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열:");
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        int count = 0;
        System.out.println("문자열에 있는 문자:");

        for(int i = 0; i<arr.length; i++){
            arr[i] = str.charAt(i);
            boolean flag = true;

            for(int j = 0;j < i; j++){
                if(arr[j] == arr[i]){
                    flag = false; 
                    //true가 아니기에 프린트 xx
                }
            }
            if(flag == true){
                count ++;
                if(i==0){
                    System.out.print(arr[i]);
                }else{
                    System.out.print(","+arr[i]);
                }
            }
        }
//1회전 flag = true count1 a
//2회전 flag = true count2 ,p
//3회전 flag = false
//4회전 flag = true count3, l
//5회전 flag = true count4, e
    }
}