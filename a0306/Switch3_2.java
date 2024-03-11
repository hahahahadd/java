package a0306;

public class Switch3_2 {
    public static void main(String[] args) {
      //자바 12버전 이상부터
       char grade ='B';
    switch(grade) {
        case 'A', 'a' ->System.out.println("우수회원입니다.");
        
        case 'B', 'b' ->System.out.println("일반회원입니다.");
        
        default -> System.out.println("손님입니다.");
        //실행문이 한개면 중괄호 생략 사는
    }

       
    }
}
