import java.util.Scanner;

public class bai6
{
    public static void main(String[] args) 
    {
        //nhap so luong
        System.out.println("Xin moi nhap so luong: ");
        Scanner console = new Scanner(System.in);

        int count = console.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum =0;

        for (int i =1; i<=count ; i++)
        {
            System.out.println("Nhap so thu " + i + ": ");
            int number = console.nextInt();
            
            if(number > max)
            {
                max = number;
            }
            if(number < min)
            {
                min = number;
            }

            sum+= number;

            System.out.println("# " + i + "= " + number);
        }

        System.out.println("Max = " +max);
        System.out.println("Min = " +min);
        System.out.println("Tong = " +sum);


    }
}