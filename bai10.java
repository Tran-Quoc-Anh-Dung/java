import java.util.Scanner;

public class bai10
{
    public static void main(String[] args) 
    {
        //nhap so luong
        System.out.println("Nhap gia tri n: ");
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        double sum = 0.0;

        for(int i=1; i<=n;i++)
        {
            sum+=1.0/i;
        }
        System.out.println("Tong la: " +sum);
        console.close();
    }
}