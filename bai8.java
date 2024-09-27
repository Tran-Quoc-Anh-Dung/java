import java.util.Scanner;
public class bai8
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // nhập bán kính 
        System.out.println("Ban kinh: ");
        double r= console.nextDouble();

        // tính thể tích hình tròn

       double V=(4/3)*Math.PI * Math.pow(r,3);

       // In kết quả
       System.out.println("The tich hinh tron la: " + V);

       console.close();
    }
    
}