import java.util.Scanner;

public class bai2
{
    public static void main(String[] args) {
        System.out.println("Xin moi nhap so diem: ");
        Scanner console = new Scanner(System.in);

        double diem = console.nextDouble();

        String diemso="A";

        if(diem>=90)
        {
            diemso="A";
        }
        else if(diem>=80)
        {
            diemso="B";
        }
        else if(diem>=70)
        {
            diemso="C";
        }
        else if(diem>=60)
        {
            diemso="D";
        }
        else 
        {
            diemso="F";
        }

        System.out.println("Xep loai la: " + diemso);

    }
}