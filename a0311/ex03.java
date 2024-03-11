package a0311;

import java.util.Arrays;

public class ex03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5};
        boolean hasDuplicates = false;
        Arrays.sort(array);
        // System.out.println(Arrays.toString(array)); 
        //정렬 유무 확인
        for(int i = 0; i < array.length-1; i++){
            if(array[i] == array[i+1]){
                hasDuplicates = true;
                System.out.println("중복된수는"+array[i]);
                break;
            }
        }
        System.out.println("배열의 중복된 요소가 있는가?"+ hasDuplicates);
    }
}
