import java.util.Scanner;
public class th1
{
    public static void main(String[] args) {
        //người dùng nhập số ngày
        System.out.println("Ban muon nhap nhiet do bao nhieu ngay? ");
        Scanner console = new Scanner(System.in);
        int days = console.nextInt();

        //--------------
        //dùng for nhập vòng lặp ngày
        // tính tổng vói số vừa nhập

        // đặt biến tổng
        double sum = 0;

        // Sau đó người nhập lặp đi lặp lại(dùng for
        for(int i = 1; i<=days; i++)
        {
            System.out.println("Nhiet do ngay thu " + i + " :");
            int next = console.nextInt();
            sum += next;
        }

        // tính trung bình
        double trungbinh = sum/days;
        System.out.println("Nhiet do trung binh = " + trungbinh);
    }
}