

public class baithuchanh7{
    public static void main(String[] args) {
        
        //đặt i là dòng; j là biến chạy
        int i,j;
        for(i=1; i<=5; i++)
        {
            //in khoảng trắng
            for(j=1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }

            // in kí tự *
            for(j=1; j<=(11-2*i); j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for( i=5; i>=1; i--)
        {
            //in khoảng trắng
            for( j=1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }

            //in kí tự *
            for( j=1; j<=(11-2*i); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}