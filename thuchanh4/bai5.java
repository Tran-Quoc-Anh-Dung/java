import java.util.Scanner;

public class bai5
{
    public static void main(String[] args) 
    {
        //nhap so luong
        System.out.println("Xin moi nhap so luong phan tu: ");
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        int sum=0;
        int countNegative = 0;

        //khoi tao mang
        

        for(int i=1; i<=n; i++)
        {
            System.out.println("Nhap so thu " + i + ": ");
            int number = console.nextInt();
            sum +=  number;

            //kiem tra so am
            if(number < 0)
            {
                countNegative ++;
            }
            System.out.println("So # " + i + "= " + number);

        }

        

        System.out.println("Tong = " +sum);
        System.out.println("So luong so am = " + countNegative);

        

        console.close();



    }
}
