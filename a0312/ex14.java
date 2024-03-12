package a0312;

import java.util.Arrays;

public class ex14 {
    public static void main(String[] args) {
        int tempValue, temp = 0;
        int[] arr = new int[6];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 45 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        } //중복방지
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tempValue = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempValue;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}