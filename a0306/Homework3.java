package a0306;
public class Homework3 {
    public static void main(String[] args) {
        int sum = 0;
        while(sum != 5){
            int num = (int) (Math.random()*6) + 1;
            int num1 = (int) (Math.random()*6) + 1;
            sum = num + num1;
            System.out.println(num+"과"+num1);
        }
    }
    
}
