package a0306;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        
        while(run){
            System.out.println("------");
            System.out.println("1.예금| 2.출금| 3.잔고| 4.종료");
            System.out.println("------");
            System.out.println("선택>");

            String strNum = scanner.nextLine();

            if(strNum.equals("1")){
                for(var i = 0; i<=10000; i++){
                    if(i==10000){
                        System.out.println("예금액>"+i);
                    }
                }
            }
            if(strNum.equals("2")){
                for(var i = 0; i<=2000; i++){
                    if(i==2000){
                        System.out.println("예금액>"+i);
                    }
                }
            }
            if(strNum.equals("3")){
                for(var i = 0; i<=8000; i++){
                    if(i==8000){
                        System.out.println("예금액>"+i);
                    }
                }
            }
            else if(strNum.equals("4")){
                
                run =false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
