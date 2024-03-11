package a0306;
public class Homwork1 {
    public static void main(String[] args) {
       
        int sum = 0;
        
        // 주사위를 두 번 던져 나온 값의 합이 5가 될 때까지 반복
        while(sum != 5){
            int num = (int) (Math.random()*6) + 1; 
            int num1 = (int) (Math.random()*6) + 1;
            sum = num + num1;
            System.out.println(num + "," + num1);
        }
        }
    }

