package a0308;

public class sol3 {
    public static void main(String[] args) {
        int[][] scores = { {80, 90, 96}, {76, 88} };

        int sum = 0;
        int student = 0;
        int a = scores.length;

        for(int i = 0; i<a; i++){
            student += scores[i].length;
            for(int k = 0; k<scores[i].length; k++){
                sum += scores[i][k];
            }
        }
        System.out.println(sum);
        System.out.println(sum/student);
    }
}
