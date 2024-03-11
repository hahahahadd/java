package a0307;

public class indexOfcontains {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        //프로그래밍의 시작위치 띄어쓰기도 감지 ->인덱스번호 3번에서 시작
        String subString = subject.substring(location);
        System.out.println(subString);

        location = subject.indexOf("자바"); //0번
        System.out.println(location);

        location = subject.indexOf("JAVA"); //-1번
        System.out.println(location);
        //찾는 문자열이 있으면 인덱스 시작 번호
        //찾는 문자열이 없으면 인덱스 -1
        if(location != -1){
            System.out.println("자바와 관련된 책이군요.");
        }else{
            System.out.println("자바와 관련 없는 책이군요.");
        }

        boolean result = subject.contains("자바"); //불린으로 자바라는글자가 들어간지 확인 가능
        if(result){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련없는 책이군요.");
        }
    }
}
