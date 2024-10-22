import java.util.Scanner;

public class CH3_thuchanh9 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Xin moi nhap ban kinh a: ");
            double r=console.nextDouble();
            
            double V = (4.0 /3.0)* Math.PI * Math.pow(r,3);
            System.out.println("The tich la: "+ V);
        }
    }
}
