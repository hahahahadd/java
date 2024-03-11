package a0308;

public class lotte2 {
    public static void main(String[] args) {
        int lotto[] = new int[6];
        //번호생성
        for(int i=0; i<6; i++){
            lotto[i] = (int)(Math.random()*45)+1;
            //중복번호제거
            for(int j=0; j<i; j++){
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
                //중복이 발견되면 i를 감소시켜 현재 위치에 다시 번호 생성
            }

        }
        //12 12
        System.out.println("로또 번호");
        for(int i = 0; i<6; i++){
            System.out.println(lotto[i]+"");
        }
    }
}
