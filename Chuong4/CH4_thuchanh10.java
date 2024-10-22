import java.util.Scanner;

public class CH4_thuchanh10 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Vui long nhap gia tri n: ");
            int n = console.nextInt();
            
            double sum = 0.0;
            
            for (int i = 1; i <= n; i++)
            {
                sum += 1.0 /i;
            }
            
            System.out.println("Tong cua day la: " + sum);
        }
    }
}
