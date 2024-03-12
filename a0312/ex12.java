package a0312;

import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i = 0;i <arr.length; i++){
            int random = (int)(Math.random()*10+1);
            arr[i] = random;
            
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("최대값은:"+max);
        System.out.println("최소값은:"+min);
    }
}
