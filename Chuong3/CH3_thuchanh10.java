import java.util.Scanner;

public class CH3_thuchanh10 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Xin moi nhap n: ");
            int n=console.nextInt();
            
            System.out.println("Cac so 2 mu tu 1 den "+ n + " : ");
            for(int i=1; i <=n; i++){
                System.out.println("2^" + i + " = "+ (int)Math.pow(2,i));
            }
        }
    }
}



        
    
