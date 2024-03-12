package a0312.car1;

public class Tv {

    //Tv의 속성(멤버변수)
    String color;
    boolean power; //전원상태( on?off)
    int channel;

    //tv의 기능(메서드)
    void power() {power = !power;} //void들어간것은 return xx
    void channelUp() {++channel;}
    void channelDown() {--channel;}

}
