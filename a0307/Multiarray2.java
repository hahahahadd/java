package a0307;

public class Multiarray2 {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 82;

        int toltalStudent = 0;
        int toltalMathSum = 0;
        for(int i = 0; i<mathScores.length; i++){
            toltalStudent += mathScores[i].length;
            for(int k = 0; k<mathScores[i].length; k++){
                toltalMathSum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double) toltalMathSum / toltalStudent;
        System.out.println(totalMathAvg);
        System.out.println(toltalMathSum);
    }   
}
