package a0312;

import java.util.Arrays;

public class Clone1 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        int[] y =x; //얕은복사
        int[] xClone = x.clone();//깊은복사
        System.out.println(xClone == x);
        System.out.println(y == x);
        System.out.println(xClone.getClass() == x.getClass());
        System.out.println(xClone.equals(x)); //equals는 배열비교 xx

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length-2); //{1,2,3}
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);//{1,2,3,4,5}
        int[] arr4 = Arrays.copyOf(arr1, arr1.length+2);//{1,2,3,4,5,6,7}
    }
}
