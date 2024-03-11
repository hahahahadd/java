package a0311;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("치킨이름을 입력하세요");
        String str = sc.nextLine();
        System.out.println("----------------");
        String [] array = {"비비큐", "bhc", "굽네"};

        boolean isAvailable = false;
       for(int i = 0; i<array.length; i++){
        if(array[i].equals(str)){
            isAvailable = true;
            break;
        }
       }
       if(isAvailable){
        System.out.println(str+"배달 가능합니다.");
       }else{
        System.out.println("배달안돼요");
       }
    }
}
