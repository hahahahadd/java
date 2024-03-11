package a0308;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8 ,9};
        
        System.out.println(Arrays.toString(numArr));

        for(var i = 0; i<9; i++){
            int n = (int)(Math.random()*10);//0~9중 임의 한 값을 임의로 얻는다.
            int temp = numArr[0]; 
            numArr[0] = numArr[n]; //index0 자리에 index n 의값대입
            numArr[n] = temp; //index n 자리에 index 0 의값대입
     //계속 인덱스0번은 바꿔주고, 0에 대응되는 다른 인덱스번호의 값을 랜덤으로 바꿔줌      
}
        System.out.println(Arrays.toString(numArr));
 
    }
}
