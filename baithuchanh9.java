public class baithuchanh9{
    public static void main(String[] args) {
        //đặt i là dòng, j là biến chạy
        int i,j;
        System.out.println("+------+");
        for(i=1; i<=3; i++)
        {
            //in khoảng trắng
            System.out.print("|");
            for(j=1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("\\");

            
            //in kí tự .
            for(j=1; j<=(6-2*i); j++)
            {
                System.out.print(".");
            }
            System.out.print("/");
            for(j=1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            
            System.out.print("|");
            
            System.out.println();
        }

        
        for(i=3; i>=1; i--)
        {
            System.out.print("|");
            //in khoảng trắng
            for(j=1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("/");

            //in kí tự .
            for(j=1; j<=(6-2*i); j++)
            {
                System.out.print(".");
            }
            System.out.print("\\");
            for(j=1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            
            System.out.print("|");
            System.out.println();

        }
        System.out.println("+------+");

    }
}