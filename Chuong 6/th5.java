import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class th5
{
    public static void main(String[] args) {
        
        //tao mang dem so lan xuat hien cac so tu 0 den 4 
        int [] count = new int[5];

        try
        {
            //doc file 
            File file = new File("tally.txt");
            Scanner input = new Scanner(file);

            //doc tung gia trị trong file và cập nhật mảng
            while(input.hasNextInt())
            {
                int next = input.nextInt();
                if(next >= 0 && next <= 4)
                {
                    count[next]++;
                }
            }

            input.close();

             //hiển thị kết quả
            System.out.println("Gia tri\tSo luong");
            for(int i =0; i<count.length; i++)
            {
                System.out.println(i + "\t" + count[i]);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File không tồn tại: " + e.getMessage());
        }
    }
}