package a0305;

public class Rightshift {
    public static void main(String[] args) {
        int number = -16; //11101111 + 1 = 11110000

        int result = number >> 2; //11111100
        //00000011 + 1 = 4
        System.out.println("Right Shift Result: " + result);
        //삼항연산자로 90 이상 이면 A 80 이상이면B를 주세요
    }
}
