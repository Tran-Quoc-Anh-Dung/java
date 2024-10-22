import java.util.Scanner;

public class CH4_thuchanh6 {
    public static void main(String[] args) {
        System.out.println("Vui long nhap so luong: ");
        try (Scanner console = new Scanner(System.in)) {
            int sl=console.nextInt();
            
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for(int i = 1; i <= sl; i++)
            {
                System.out.println("Nhap so thu " + i + ": ");
                int number = console.nextInt();
                
                sum += number;
                
                if(number > max)
                {
                    max = number;
                }
                if(number < min)
                {
                    min = number;
                }
                
                System.out.println("So #" + i + " = " + number);
            }
            
            
            System.out.println("Tong cac so = " +  sum);
            System.out.println("Max la = " + max);
            System.out.println("Min la = " + min);
        }
    }
}
