package a0311;

import java.util.Arrays;

public class question3 {
    public static void main(String[] args) {
        int [] num = new int[10];
        for(int j = 0; j<num.length; j++){
            num[j] = j+1;
        }
        System.out.println(Arrays.toString(num));

        for(int i = 0; i<9; i++){
            int n = (int)(Math.random()*10)+1;
            int temp = num[0];
            num[0] = num[n];
            num[n] = temp;
        }
        System.out.println(Arrays.toString(num));
    }
    
}
