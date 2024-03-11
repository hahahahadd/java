package a0307;

public class MultiArray {
    public static void main(String[] args) {
        //2차원 배열 생성
        int[][] scores = { {80, 90, 96}, {76, 88} };
        System.out.println("1차원 배열의 길이(반의 수):"+scores.length);
        System.out.println("2차원 1번의 길이(반의 수):"+scores[0].length);
        System.out.println("2차원 2번의 길이(반의 수):"+scores[1].length);
        //첫번째 반의 세 번째 학ㄱ생수의 점수를 읽어서 출력하세요;
        System.out.println("첫번째 반의 세 번째 학ㄱ생수의 점수:"+scores[0][2]);
        System.out.println("두번째 반의 두 번째 학ㄱ생수의 점수:"+scores[1][1]);

        //첫번째 반의 평균점수를 구하시오.
        int class1Sum = 0;
        for(int i = 0; i<3; i++){
            class1Sum += scores[0][i];
        }
        System.out.println("총합"+ class1Sum);
        double class1Avg = (double)class1Sum/scores[0].length;
        System.out.println("평균"+ class1Avg);

        //두번째 반의 평균점수를 구하시오.

        int class2sum = 0;
        for(int i=0; i<scores[1].length; i++){
            class2sum += scores[1][i];
        }
        System.out.println(class2sum);
        double avg2 = (double)class2sum/scores[1].length;
        System.out.println(avg2);
        System.out.println();
        //전체 학생의 평균을 구하시오
        int sum = 0;
        int student = 0;
        int a = scores.length;
        
        for(int i=0; i<scores.length; i++){ //반의 수마큼 반복
            student += scores[i].length;
            for(int k = 0; k<scores[i].length; k++){//반의 학생 수반복
                sum += scores[i][k];

            }
        }
        // System.out.println("반의 수:"+student);
        double totalavg = (double)sum/student;
        System.out.println("합계:"+sum);
        System.out.println("평균:"+totalavg);
    }
}
