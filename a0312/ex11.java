package a0312;

import java.util.Arrays;

public class ex11 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i = 0;i <arr.length; i++){
            int random = (int)(Math.random()*10)+1;
            arr[i] = random;

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"");
        }
    }
}
