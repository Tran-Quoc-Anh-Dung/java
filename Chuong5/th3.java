import java.util.Scanner;

public class th3
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int number;

        //vong lap de nhap so
        while (true) 
        { 
            System.out.println("Nhap mot so (nhap -1 de thoat): ");
            number = console.nextInt();

            //kiem tra neu nhap -1 thi thoat vong lap
            if(number == -1)
            {
                break;
            }

            //cong so nhap vao tong
            sum += number;
        }

        //hien thi tong
        System.out.println("Tong cac so da nhap la: " + sum);
    }
}