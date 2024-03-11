package a0311;

import java.util.Arrays;
import java.util.Scanner;

public class sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
           arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
