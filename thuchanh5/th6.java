import java.util.Scanner;

public class th6
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int ketqua = (int) (Math.random() * 100); //tao so ngau nhien tu 0 den 99
        int sodoan;
        int cout = 0;

        System.out.println("Chao mung ban den voi tro choi doan so !");

        // vong lap den khi doan dung
        while(true)
        {
            System.out.println("Moi ban nhap so tu [0-99]: ");
            sodoan= console.nextInt();

            //kiem tra so doan
            while(sodoan < 0 || sodoan >= 100)
            {
                System.out.println("So ban nhap da vuot qua gioi han cho phep.");
                System.out.println("Vui long nhap lai so tu 0 den 99: ");
                sodoan = console.nextInt();
            }

            cout++;

            //kiem tra doan dung
            if(sodoan == ketqua)
            {
                System.out.println("Chuc mung ban da doan dung sau " + cout + " lan doan.");
                break;
            }

            //goi y
            String ketquaStr = String.valueOf(ketqua);
            String sodoanStr = String.valueOf(sodoan);
            int SLdung = 0;

            //kiem tra xem bao nhieu chu su so doan dung
            for(int i = 0; i <Math.min(ketquaStr.length(), sodoanStr.length()); i++)
            {
                if(ketquaStr.charAt(i) == sodoanStr.charAt(i))
                {
                    SLdung++;
                }
            }

            
            System.out.println("Chua dung. Ban da doan dung " + SLdung + " chu so");
        }

        console.close();
    }
}