import java.util.Random;
import java.util.Scanner;


public class th2
{
    public static void main(String[] args) 
    {
        
        // loi gioi thieu
        System.out.println("Day la chuong trinh tung 2 xuc xac: ");
        System.out.println("Ban bam [P] hay [p] de choi. [Q] hay [q] de thoat chuong trinh.: ");

        //tao so ngau nhien tu 1 den 7
        Random r = new Random();
        
        //cho phep nguoi choi nhap ki tu
        Scanner console = new Scanner(System.in);
        String bam = console.next();

        //khoi dong so dem va tong
        int cout = 1;
        int sum = 0;
        while(bam.equalsIgnoreCase("P"))
        {
            int xucsac1 = r.nextInt(7) +1;
            int xucsac2 = r.nextInt(7) +1;
            sum = xucsac1 + xucsac2;
            if(sum ==7)
            {
                break;
            }

            //cho phep nguoi choi chon lai
            System.out.println("Ban bam [P] hay [p] de choi. [Q] hay [q] de thoat chuong trinh.: ");
            bam = console.next();
            if(bam.equalsIgnoreCase("Q"))
            {
                break;
            }

            cout ++;

            System.out.println("So lan ban da tung la: " +cout + "lan");
        }
    }
}