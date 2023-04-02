import java.util.Scanner;

public class faktorialelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        long faktorial = 1;
        long start = System.currentTimeMillis();
        
        do {
            System.out.print("Masukkan angka: ");
            n = input.nextInt();
            if (n != 0) {
                System.out.print(n + "! = ");
                for (int i = n; i >= 1; i--) {
                    faktorial *= i;
                    System.out.print(i);
                    if (i != 1) {
                        System.out.print("x");
                    }
                }
                System.out.println(" = " + faktorial);
                faktorial = 1;
            }
        } while (n != 0);

        long end = System.currentTimeMillis();
        System.out.println("waktu: " + (end - start) + " ms");
    }
}
