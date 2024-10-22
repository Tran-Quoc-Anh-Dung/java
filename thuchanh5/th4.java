import java.util.Scanner;
public class th4
{
    public static void main(String[] args) {
        //loi gioi thieu
        System.out.println("Day la chuong trinh doan so cho truoc.");
        System.out.println("Xin moi nhap so ban muon doan: ");

        //tao so dem ban dau
        int so = 42;

        //cho  nguoi choi nhap so dem
        Scanner console = new Scanner(System.in);
        int sodoan = console.nextInt();

        //khoi dong luot dem
        int cout = 0 ;

        // vong lap den khi doan dung thi stop va dem so luot doan
        while(sodoan != so)
        {
            System.out.println("Ban da doan sai roi. Xin moi nhap lai: ");
            sodoan = console.nextInt();
            cout ++;
        }

        //hien thi ket qua
        System.out.println("Chuc mung ban da doan dung. So lan doan la: " + cout + "lan");
    }
}