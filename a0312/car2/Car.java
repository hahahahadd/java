package a0312.car2;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자 선언
    Car() {}
    Car(String model){
        this.model = model;
    }
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    //생상저 오버로딩 -같은 클래스 내에 여러개의 생성자를 정의
    //각 생성자는 서로다른 매개변수 목록을 갖거나 매개변수의 타입입니다.
    //갯수가 다를 수 있따.
    //장점: 동일한 클래스에서 여러가지 방식으로 객체를 초기화
    //유연성을 제공하며 다양한 상황에서 객체를 생성한다.
}
