import java.util.Scanner;

public class bai8
{
    public static void main(String[] args) 
    {
        System.out.println("Xin moi nhap chieu cao: ");
        Scanner console = new Scanner(System.in);
        double hight = console.nextDouble();

        System.out.println("Xin moi nhap can nang: ");
        double weight = console.nextDouble();

        String Trangthai="Gay";

        double bmi;

        bmi= weight/(hight*hight);

        if(bmi< 18.5)
        {
            Trangthai="Gay";
        }
        else if(bmi <=24.9)
        {
            Trangthai="Binh thuong";
        }
        else if(bmi <=29.9 )
        {
            Trangthai="Hoi map";
        }
        else 
        {
            Trangthai="Beo";
        }

        System.out.println("Gia tri BMI la: " +bmi);
        System.out.println("Trang thai: " + Trangthai);

    }
}