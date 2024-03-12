package a0312;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요>");
        String food = sc.nextLine();

        String [] arr = {"뿌링클", "자메이카", "순살"};
        int YesNo = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals(food)){
                YesNo += 1;
                break;
            }
        }
        if(YesNo == 0){
            System.out.println(food+"은(는) 없는 메뉴입니다.");
        }else{
            System.out.println(food+"는 배달가능합니다.");
        }
    }
}
