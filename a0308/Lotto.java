package a0308;
 //45개의 정수값으 ㄹ저장하기 위한 배열 생성
 //for 문으로 배열의 가 요소에 1~45저장
 //temp=0 두값을 바꾸는 데 사용하는임시변수
 //j=0 임의의 값을 얻어서 저장할 변수
import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] numArr = new int[45]; 

        for (int i = 0; i< numArr.length; i++){
           numArr[i] = i+1;
         
        } 
        System.out.println(Arrays.toString(numArr));
        for (int j = 0; j<numArr.length; j++){
            int n = (int)(Math.random()*45)+1;
            int temp = numArr[0]; 
            numArr[0] = numArr[n]; //index0 자리에 index n 의값대입
            numArr[n] = temp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}

