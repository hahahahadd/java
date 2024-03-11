package a0308;

public class MinMax {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33,100,55,95};
        int max = score[0]; //79거 둘오검
        int min = score[0];

        for(var i = 1; i<score.length; i++){
            if(score[i]>max){
                max = score[i];
            }else if(score[i]<min){
                min = score[i];
            }
        }System.out.println("최솟값"+min);
        System.out.println("최댓값"+max);
    }

}
