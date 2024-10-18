import java.util.Scanner;

public class bai4
{
    public static void main(String[] args) 
    {
        //nhap so luong
        System.out.println("Xin moi nhap so luong: ");
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int tong=0;

        for (int i=1; i<=n; i++)
        {
            System.out.print("Nhap so thu " + i +": ");
            int so = console.nextInt();
            tong= tong +so;
            System.out.println("So # " + i + "=" + so);
        }

        //Hien thi tong
        System.out.println("Tong cua cac so = " +tong);

        console.close();


    }
}