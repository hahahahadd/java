package a0311;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] a = {3, 5, 1, 2, 4};
        int tempValue;
        for(int i =0; i<a.length; i++){
            for(int j = 0; j < a.length -1-i; j++){
                //단계별로 회전이 감소함
                if(a[j]>a[j+1]){
                    tempValue = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tempValue;
                }
            }
           
        }
        System.out.println(Arrays.toString(a));
    }
}
