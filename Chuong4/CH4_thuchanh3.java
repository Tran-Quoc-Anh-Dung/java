
import java.util.Scanner;

public class CH4_thuchanh3 {
    public static void main(String[] args) {
        //yesno
        System.out.println("Xin moi nhap[yes] hay [no]: ");
        try (Scanner console = new Scanner(System.in)) {
            String nhap=console.next();
            
            if(nhap=="yes")
            {
                System.out.println("Ban da nhap YES");
            }
            else if(nhap=="no")
            {
                System.out.println("Ban da nhap NO");
            }
            else
            {
                System.out.println("Ban da khong nhap Yes hay NO");
            }
            
            //dung equals
            if(nhap.equals("yes"))
            {
                System.out.println("Ban da nhap YES");
            }
            else if(nhap.equals("no"))
            {
                System.out.println("Ban da nhap NO");
            }
            else
            {
                System.out.println("Ban da khong nhap Yes hay NO");
            }
            
            //use equalsIgnoreCase
            if(nhap.equalsIgnoreCase("yes"))
            {
                System.out.println("Ban da nhap YES");
            }
            else if(nhap.equalsIgnoreCase("no"))
            {
                System.out.println("Ban da nhap NO");
            }
            else
            {
                System.out.println("Ban da khong nhap Yes hay NO");
            }
        }
    }
}
