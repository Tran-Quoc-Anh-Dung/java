import java.util.Scanner;

public class bai1
{
    public static void main(String[] args) {
        System.out.println("Xin moi nhap so tien: ");
        Scanner console = new Scanner(System.in);

        double money = console.nextDouble();

        if(money<500)
        {
            System.out.print("Cash is dangerously low. Bet carefully.");
        }
        else if(money<1000)
        {
            System.out.print("Cash is somewhat low. Bet moderately.");
        }
        else 
        {
            System.out.print("Cash is in good shape. Bet liberally.");
        }
    }
}