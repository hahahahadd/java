import java.util.Scanner;

public class scaner1 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("X값입력:");
    String strX = scanner.nextLine();
    int x = Integer.parseInt((strX));

    System.out.println("y45값입력:");
    String strY = scanner.nextLine();
    int y = Integer.parseInt((strY));

    int result = x + y;
    System.out.println("x+y="+result);
    System.out.println();

    while(true){
        System.out.println("입력 문자열:");
        String data = scanner.nextLine();
        if(data.equals("q")){
            break;
        }
        System.out.println("출력 무자열:"+data);
        System.out.println();
    }
    System.out.println("종료");
   } 
}
