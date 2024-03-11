package a0311;

import java.util.Arrays;

public class ex02 {
    public static void main(String[] args) {
        //배열뒤집기
      String[] array = {"A","B","c","D","E"};
       for(int i = 0; i < array.length/2; i++){
        String temp = array[i];
        array[i] = array[array.length -1 -i];
      }
      //1회전 temp = "A" array[0] = array[4] 'E'가 들어감 array[4] 방에는 'A' 가 들어감
      System.out.println("배열 두집기 후:"+Arrays.toString(array));
    }
}
