package a0311;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열:");
        String str = sc.nextLine();

        System.out.println("문자:");
        char ch = sc.nextLine().charAt(0);
        //문자열이 들어가 문자배열의 크기
        char[] arr = new char[str.length()];
        //arr은 str의 각문자를 담기위한 문자 배열
        //arr[0]='a' arr[1]='p';
        for(int i =0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }
        // System.out.println(Arrays.toString(arr));
        int count = 0;
        System.out.println("application에 i가 존재하는 위치:");
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == ch){
                System.out.print(i + ""); //문자열이 위치한 인덱스 번호
                count++;

            }
        }
        System.out.println();
        System.out.println("i개수:"+count);
        sc.close();
    }
}
