package a0306;

public class sol42_1 {
    public static void main(String[] args) {
       int[] arr = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3};
       int max = 0;
       int num = 0;
       
       for(int i = 0; i<=10; i++){
            int cnt = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[j]==i){
                    cnt++;
                }
            }if(max < cnt){
                max = cnt;
                num = i;
            }
       }
    

    }
}
