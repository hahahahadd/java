package a0304;

public class int2 {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
		//long var3 = 1000000000000; 컴파일러는 int로 간주 하기때문에 에러
		long var4 = 1000000000000L;

        System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var4: " + var4);
    }
}

