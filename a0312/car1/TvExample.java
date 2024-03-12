package a0312.car1;

public class TvExample {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown(); //체널을 내림
        System.out.println("현재 채널은"+t.channel+"입니다.");
    }
}
