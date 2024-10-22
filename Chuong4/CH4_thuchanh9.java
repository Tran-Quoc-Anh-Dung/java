import java.util.Scanner;

public class CH4_thuchanh9 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Vui long nhap ky tu de chon mau BlUE(B), GREEN(G), RED(R): ");
            
            String nhap = console.next();
            
            if(nhap.equalsIgnoreCase("B") && nhap.equalsIgnoreCase("b"))
            {
                System.out.println("Ban da chon mau BLUE");
            }
            else if(nhap.equalsIgnoreCase("G") && nhap.equalsIgnoreCase("g"))
            {
                System.out.println("Ban da chon mau GREEN");
            }
            else if(nhap.equalsIgnoreCase("R") && nhap.equalsIgnoreCase("r"))
            {
                System.out.println("Ban da chon mau RED");
            }
            else{
                System.out.println("Ban da nhap sai");
            }
        }
    }
}

