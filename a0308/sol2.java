package a0308;

import java.util.Scanner;

public class sol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        while(run){
            System.out.println("----------");
            System.out.println("1.학생수 |2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------");
            System.out.println("선택>");
            String num = scanner.nextLine();

            if(num.equals("1")){
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("학생수>");
                num1 = scanner1.nextInt();
            }else if(num.equals("2")){
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("score[0]>");
                num2 = scanner2.nextInt();

                Scanner scanner3 = new Scanner(System.in);
                System.out.println("score[1]>");
                num3 = scanner3.nextInt();
                
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("score[2]>");
                num4 = scanner4.nextInt();
 
            }else if(num.equals("3")){
                System.out.println("score[0]>"+num2);
                System.out.println("score[1]>"+num3);
                System.out.println("score[2]>"+num4);
            }else if(num.equals("4")){
                int[] array = {num1, num2, num3};
                int max = array[0];
                for(int i = 0; i<array.length; i++){
                    if(max<array[i]){
                        max = array[i];
                    }
                } 
                System.out.println("최댓값="+max);
                System.out.println("평균값"+(num4+num2+num3)/num1);
            }else if(num.equals("5")){
                System.out.println("종료");
                break;
            }else{
                System.out.println("범위내에서 입력해주세요.");
            }
        }
    }
}
