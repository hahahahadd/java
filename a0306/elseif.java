package a0306;

public class elseif {
    public static void main(String[] args) {
        int score = 33;
        if(score >= 90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }else if(score >= 80){
            System.out.println("점수가 80보다 작습니다.");
            System.out.println("등급은 b입니다.");
        }else if(score >= 70){
            System.out.println("점수가 70보다 작습니다.");
            System.out.println("등급은 c입니다.");
        }else if(score >= 60){
            System.out.println("점수가 60보다 작습니다.");
            System.out.println("등급은 d입니다.");
        }else{
            System.out.println("점수가 50보다 작습니다.");
            System.out.println("등급은 f입니다.");
        }
    }
}
