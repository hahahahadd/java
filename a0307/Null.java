package a0307;

public class Null {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10;
        //배열 객체가 없으므로 당연히 저장불가
        //자바의 모든 객체는 기본적으로 null로 초기화 되어있음.
        //객체가 아무런 내용을 갖고있지 않음.
        String str = null;
        System.out.println("총 문자 수:"+str.length());
        //nullpointerException
        //1. null값을 가진 객체에 접근하려고 할때
        //2.어떤 객체가 'null'을 참조하고 있는데, 그 객체의 매서드나 속성 등을 호출하거나 사용하려고할때 발생
        
    }
}
