package a0307;

public class length {
    public static void main(String[] args) {
       String ssn ="0209024082616";
       int length = ssn.length();

       if(length == 13){
        System.out.println("맞습니다.");
       }else{System.out.println("틀립니다.");}
    }
}
