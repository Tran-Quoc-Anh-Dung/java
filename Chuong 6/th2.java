import java.util.Scanner;
public class th2
{
    public static void main(String[] args) {
        //người dùng nhập số ngày
        System.out.println("Ban muon nhap nhiet do bao nhieu ngay? ");
        Scanner console = new Scanner(System.in);
        int days = console.nextInt();

        double [] dayso = new double[days];

        //--------------

        // đặt biến tổng
        double sum = 0;

        // Sau đó người nhập lặp đi lặp lại(dùng for
        for(int i = 0; i<days; i++)
        {
            System.out.println("Nhiet do ngay thu " + (i+1) + " :");
            int next = console.nextInt();
            sum += next;
            dayso[i] = next;
        }

        // tính trung bình
        double trungbinh = sum/days;

        //khoi dong so dem
        int cout = 0 ;
        for(int i =0; i<dayso.length - 1; i++)
        {
            if(dayso[i] > trungbinh)
            {
                cout ++;
            }
        }
        System.out.println("Nhiet do trung binh = " + trungbinh);
        System.out.println("So ngay lon hon trung binh = " + cout);
    }
}