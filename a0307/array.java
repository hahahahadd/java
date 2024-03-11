package a0307;

public class array {
    public static void main(String[] args) {
        String[] season = {"spring","Summer","Fall","Winter"};
        //String 이니 문자만 가능 type통일
        //배열의 길이는 늘리거나 줄일 수 업ㅅ다
        System.out.println("season[0]:"+season[0]);
        System.out.println("season[1]:"+season[1]);
        System.out.println("season[2]:"+season[2]);
        System.out.println("season[3]:"+season[3]);

        //인덱스1번 항목의 값 변경
        season[1] = "여름";
        System.out.println("season[1]:"+season[1]);
        System.out.println();

        //배열 변수 선언과 생성
        int[] scores = {83, 90, 87};
        int sum = 0;
        for(int i = 0; i<3; i++){
            sum += scores[i];
        }
        System.out.println("총합"+sum);
        double avg = (double)sum/3;
        System.out.println("평균"+avg);
    }
}
