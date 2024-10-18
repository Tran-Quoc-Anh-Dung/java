import java.util.Scanner;

public class bai3
{
    public static void main(String[] args) 
    {
        System.out.println("Xin moi nhap [yes] hay [no]: ");
        Scanner console = new Scanner(System.in);

        String nhap = console.next();

        if(nhap=="yes")
        {
            System.out.println("Ban da nhap Yes.");
        }
        else if(nhap=="no")
        {
            System.out.println("Ban da nhap No");
        }
        else 
        {
            System.out.println("Ban da khong nhap Yes hay No.");
        }

        //su dung equal
        if(nhap.equals("yes"))
        {
            System.out.println("Ban da nhap Yes.");
        }
        else if(nhap.equals("no"))
        {
            System.out.println("Ban da nhap No.");
        }
        else 
        {
            System.out.println("Ban da khong nhap Yes hay No.");
        }

        //su dung equalsIgnoreCase
        if(nhap.equalsIgnoreCase("yes"))
        {
            System.out.println("Ban da nhap Yes.");
        }
        else if(nhap.equalsIgnoreCase("no"))
        {
            System.out.println("Ban da nhap No.");
        }
        else 
        {
            System.out.println("Ban da khong nhap Yes hay No.");
        }

    }
}