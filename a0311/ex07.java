package a0311;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String str = sc.nextLine();
        String [] array = str.split("");
        boolean hasDuplicates = false;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("문자를 입력하세요.");
        String str1 = sc.nextLine();
        int sum = 0;
        for(int i =0; i<array.length-1; i++){
            if(array[i].equals(str1)){
                hasDuplicates = true;
                
                System.out.println(str1+"이 존재하는 인덱스 위치는"+i+"입니다.");
                sum++;
                
            }else{
                System.out.println("문자열에 없는 문자입니다.");
            break;}
        }System.out.println("i의 개수는"+sum);

    }
}
