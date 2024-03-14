package a0313.aven;

public class AccountTest {
    public static void main(String[] args) {
      Account acc = new Account();
      // acc.balance(1000); //error 
      acc.setBalnce(1000);
      System.out.printf("잔액 : %d",acc.getBalnce());
    }
}
class Account{
    private int balance; //잔액 , private 적용

    //게터 메소드 - 값을 읽을때 사용
    public int getBalnce(){
        return balance;
    }
    //세터 메소드 - 값을 지정할때 사용
    //정보에 은닉, 캡슐화
    public void setBalnce(int b){
        balance = b;
    }

}
