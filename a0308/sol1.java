package a0308;

public class sol1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];
        for(int i=0; i<=array.length-1; i++){
            if(array[i]>max){
                max = array[i];
            }
        }System.out.println(max);
    }
}
