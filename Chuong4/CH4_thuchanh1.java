import java.util.Scanner;

public class CH4_thuchanh1 {
    public static void main(String[] args) {
        System.out.println("Xin moi nhap so tien: ");
        try (Scanner console = new Scanner(System.in)) {
            double money = console.nextDouble();
            
            if (money < 500)
            {
                System.out.println("Cash is danerously low. Bet carefully.");
            }
            else if(money < 1000)
            {
                System.out.println("Cash is somewhat low. Bet moderately.");
            }
            else
            {
                System.out.println("Cash is in good shape. Bet liberally.");
            }
        }
    }
}
