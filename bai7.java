import java.util.Scanner;
public class bai7
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // nhập tam giác 
        System.out.println("Canh a: ");
        double a= console.nextDouble();

        System.out.println("Canh b: ");
        double b=console.nextDouble();

        System.out.println("Canh c: ");
        double c=console.nextDouble();

        System.out.println("Chu vi la: " + chuvi(a,b,c));
        System.out.println("Nua Chu vi la: " + nuachuvi(a,b,c));
        System.out.println("Dien tịch la: " + dientich(a,b,c));
    }

    public static double chuvi(double a, double b, double c)
    {
        double p=a+b+c;
        return p;
    }

    public static double nuachuvi(double a, double b, double c)
    {
        chuvi(a,b,c);
        double p=chuvi(a,b,c)/2;
        return p;
    }

    public static double dientich(double a, double b, double c)
    {
        chuvi(a,b,c);
        double p=chuvi(a,b,c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}