package a0307;

public class Split {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습힌다.,홍길동";
        //문자열 분리
        String[] tokens = board.split(",");
        //board를 ,로 구분하여 배열 토큰에 저장
        System.out.println("번호:"+tokens[0]);
        System.out.println("제목:"+tokens[1]);
        System.out.println("내용:"+tokens[2]);
        System.out.println("성명:"+tokens[3]);
        System.out.println();

        for(var i = 0; i<=3; i++){
            String a = "1,자바 학습,참조 타입 String을 학습힌다.,홍길동";
            String b = "번호, 제목, 내용, 설명";
            //문자열 분리
            String[] token = a.split(",");
            String[] token1 = b.split(",");
            System.out.println(token1[i]+':'+token[i]);
        }
    }
}
