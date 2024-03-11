package a0308;


public class lotto1 {
    public static void main(String[] args) {
      
        //ball  45개의 정수값을 저장하기 위한 배열 생성
        int[] ball = new int[45];

        // for문으로 배열의 각 요소에 1~45 저장
        for(int i=0; i < ball.length;i++){
            ball[i] = i+1;
        }

        //tmp=0 두값을 바꾸는데 사용하는임시변수
        // j =0  //임의의 값을 얻어서 저장할변수
        int tmp = 0;
        int j = 0;

        //배열 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을섞는다.
        //  0번째 부터 5번째 요소가지 모두 6개만 바꾼다.
        for(int i=0; i < 6; i++){
            j = (int)(Math.random()*45); 
            // j 는 0~ 44  Math.random 으로 임의의 값을 얻는다.
            tmp  = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
            //ball[i] 와 ball[j]의 값을 서로 바꾼다.
        }

        
        
        
        //배열 ball 앞에서 6개의 요소를 출력한다.
        for(int i=0;i < 6 ; i++){
            System.out.printf("ball[%d] = %d\n",i,ball[i] );
        }
    }
}
