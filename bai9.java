import java.util.Scanner;
public class bai9
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // nhập so n
        System.out.println("Nhap so nguyen duong n: ");
        int n= console.nextInt();

        // Hiển thị mũ 2 từ 1 đến n
        System.out.println("Cac so mu 2 tu 1 den n la: " + n + ":");
        for(int i=1;i<=n;i++)
        {
            System.out.println("2^" + i + "=" + (int)Math.pow(2,i));
        }
       
       console.close();
    }
    
}