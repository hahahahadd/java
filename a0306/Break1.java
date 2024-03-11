package a0306;

public class Break1 {
    public static void main(String[] args) {
        while(true){
            int num = (int)(Math.random()*6) + 1;
            System.out.println(num);
            if(num == 6) {
				break;
			}
        }
        System.out.println("프로그램 종료");
    } 
}
