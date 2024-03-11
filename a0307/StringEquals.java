package a0307;

public class StringEquals {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        System.out.println("strvar1의 주소는"+System.identityHashCode(strVar1));
        System.out.println("strvar2의 주소는"+System.identityHashCode(strVar2));
        if(strVar1 == strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같음");
        }else{
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        //자바는 문자열 리터럴이 동일하다면 String 객체를 공유하도록 설계
        if(strVar1.equals(strVar2)){
            System.out.println("strVar1 과 strVar2는 문자열이 같음");
        }
        //equals는 내용을 비교 ==는 주솟값을 비교
        //new연산자는 새로운 객체를 만드는 연산자
        //이 경우는 strVar3,strVar4가 다른 것을 의미함
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");
        System.out.println("str3의 주소는"+System.identityHashCode(strVar3));
        System.out.println("str4의 주소는"+System.identityHashCode(strVar4));
        if(strVar3 == strVar4){
            System.out.println("같음");
        }else{System.out.println(
            "다름"
        );}

        if(strVar3.equals(strVar4)){
            System.out.println("같음");
        }
    }
}
