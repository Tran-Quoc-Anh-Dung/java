import java.util.Random;
import java.util.Scanner;



public class th7
{
    public static void main(String[] args) {
        
        // loi gioi thieu
        System.out.println("Day la chuong trinh tro choi doan chu: ");
        System.out.println("Sinh vien thuc hien: ");

        Scanner console = new Scanner(System.in);
        Random r = new Random();
        int attempts = 0; //so lan thu
        boolean doandung = false;

        System.out.println("Hay chon mot so tu 1 den 10 va toi se doan no: ");

        //vong lap cho den khi dung
        while(!doandung)
        {
            attempts ++;
            int guess = r.nextInt(10)+1; //tao so ngau nhien tu 1 den 10
            System.out.println("So ban chon co phai la " + guess + " khong? (Y or N: )");
            String response = console.nextLine(); // nhap cau tra loi cua ng choi

            //kiem tra cau tra loi cua ng choi
            if(response.equalsIgnoreCase("Y"))
            {
                doandung = true;
                System.out.println("Toi da doan dung so cua ban sau " + attempts + " lan.");
            }
        }

        console.close();
    }
}