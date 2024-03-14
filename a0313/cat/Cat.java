package a0313.cat;

class Cat {
    String name; //이름 -> 멤버변수,필드(상태)
    String breeds; //품종
    double weight; // 체중

    //retrun 값이 없는것은  void - 메소드(동작)
    void claw(){
        System.out.println("할퀴기");
    }
    void meow() {
        System.out.println("야옹~");
    }

    public static void main(String[] args) {
        //객체생성
       Cat c = new Cat();
//클래스타입 레퍼런스변수(참조) = new 클래스명;

       //객체 상태(필드) 변경
        c.name = "네로";
        //. 닷연산자
        //참조변수 c에 연결된 객체로 접근
        //해당객체에서 name을 가져온다.
        c.breeds = "페르시안";
        c.weight = 4.37;

        //객체 상태(필트 출력)
        System.out.printf("이름 : %s\n",c.name);
        System.out.printf("품종 : %s\n",c.breeds);
        System.out.printf("체중 : %.2fkg\n",c.weight);
//객체 지향 프로그래밍(object oriented programming)
//자전거의 핸들 , 본체, 바퀴, 안장 모여서 자전거
//객체 지향 프로그래밍
//재사용성이 좋다.
//클래스 - 객체의 설계도, 붕어빵기계
//핸들을 찍는 기계 =>(인스턴스화)     핸들(인스턴스,객체)
//클래스 객체의 설계도이다.
//클래스 토대로 객체를 만드는 과정을 인스턴스화
//클래스는 상태를 나타내는 필드(멤버변수)와
//동작을 나타내는 메서드로 이루어져있다.

    }
}
