package a0305;

public class Increase {
    public static void main(String[] args) {
        int x = 10;
		int y = 10;
		int z;
        x++;
		++x;
		System.out.println("x=" + x);
       
        System.out.println("-----------------------");		
		y--;
		--y;
		System.out.println("y=" + y);
        System.out.println("-----------------------");	
        z = x++;
        //증감연산자가 뒤에있으면 모든연산이 끝난후 x가 증가
        System.out.println("z=" + z);
		System.out.println("x=" + x);

        System.out.println("-----------------------");		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);

        System.out.println("-----------------------");				
		z = ++x + y++; //x -> 15 y -> 9로 증가전에 + 연산이 먼저실행
		//z = 23
        System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

    }
}
