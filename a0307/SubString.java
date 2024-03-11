package a0307;

public class SubString {
    public static void main(String[] args) {
        String ssn = "020902-4082616";
        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);
        //ssn.substring(0,6)인덱스 번호 0 부터 6번 이전까지 추출
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
        //ssn.substring(7)인덱스 번호 7번부터 끝까지
    }
}
