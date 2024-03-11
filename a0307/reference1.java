package a0307;

public class reference1 {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1,2,3};
        arr2 = new int[] {1,2,3};
        arr3 = arr2;
        //배열 변수 arr2의 값을 배열 변수 arr3에 대입
        System.out.println(arr1 == arr2);
        //주소 자체를 비교하기 때문에 다름 (aarl의 123) 과 (arr2의 123) 은 다름
        System.out.println(arr2 == arr3);
        //=으로 주소 자체를 동일하게 했기 때문에 같은 것으로 나옴.

        if(arr1.equals(arr2)){
            System.out.println("같음");
        }else{System.out.println("다름");}
    }
}
