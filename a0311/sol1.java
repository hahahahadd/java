package a0311;

import java.util.Arrays;

public class sol1 {
    public static void main(String[] args) {
        int []num = new int[10];
        for(int i = 9; i >= 0; i-- ){
            num[i] = 9 - i;
        }
        System.out.println(Arrays.toString(num));
    }
}
