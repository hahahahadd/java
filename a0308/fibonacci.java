package a0308;

public class fibonacci {
    public static void main(String[] args) {
        int result = 1;
        for(int i=1; i<=100; i++){
            result *= i;
        }
        System.out.println(result);
    }
}

// a1 = a1
// a2 = a1 + 0
// a3 = 1 + 1 + a2
// a4 = 1 + 1 + a2 + a3