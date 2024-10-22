import java.util.Scanner;

public class CH4_thuchanh8 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            
            System.out.println("Vui long nhap chieu cao (CM): ");
            double heightCM = console.nextDouble();
            double height = heightCM / 100;
            
            System.out.println("Vui long nhap can nang (kg): ");
            double weight = console.nextDouble();
            
            double bmi;
            bmi = weight / (height * height);
            System.out.println("Gia tri BMI cua ban la: " + bmi);
            if (bmi < 18.5) {
                System.out.println("Gay");
            } else if (bmi < 24.9) {
                System.out.println("Binh Thuong");
            } else if (bmi < 29.9) {
                System.out.println("Hoi Map");
            } else {
                System.out.println("Beo");
            }
        }
    }
}
