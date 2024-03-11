package a0307;

import java.util.Scanner;

public class sol3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); //790101
        int male = scan.nextInt(); //1
        
        int birth_year;
        if(male ==1 || male ==2){
            birth_year = 1900 + number / 10000;  //79 만 추출
        }else{
            birth_year = 2000 + number / 10000;
        }
        int age = 2026 - birth_year;
        System.out.println("나이는 :" + age);
    }
}
