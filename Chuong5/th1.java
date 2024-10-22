
import java.util.Random;
import java.util.Scanner;


public class th1
{
    public static void main(String[] args) {
        
        // loi gioi thieu
        System.out.println("Day la chuong trinh tro choi doan chu: ");
        System.out.println("Sinh vien thuc hien: ");

        //tao so ngau nhien
        Random r = new Random();
        int soao = r.nextInt(10)+1; //tao so ngau nhien tu 1 den 10

        //cho phep nguoi dung tao so
        System.out.print("Xin moi nhap so ma ban doan: ");
        Scanner console= new Scanner(System.in);
        int sodoan = console.nextInt();

        int cout = 1; //tao so dem
        while(soao!= sodoan)
        {
            System.out.println("Rat tiec ban da doan sai. ");
            System.out.println("Xin moi nhap so ma ban doan: ");
            sodoan = console.nextInt();
            cout ++;
        }

        System.out.println("---------------------------------");
        System.out.println("Chuc mung ban da doan dung. Ban da doan " + cout + "lan");
    }
}