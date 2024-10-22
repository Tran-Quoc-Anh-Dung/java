public class thuchanh9 {
    public static void main(String[] args) {
        hinh1();
        hinh2();
        hinh3();
        hinh1();
        hinh3();
        hinh2();
        hinh1();
    }
    public static void hinh1() {
        System.out.println("+----------+");
    }
    public static void hinh2() {
        int i,j; // i là dòng , j là sl dấu 
        for( i = 1; i <= 5; i++)
        {
            
            System.out.print("|");

            //in khoảng trống
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            
            //in dấu . lấy sl + 2 * dòng = 4+2 * dòng
            for (j=1;j<=(10-2*i);j++)
            {
                System.out.print(".");
            }
            System.out.print("/");
            
            //in khoảng trống
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
    }
    public static void hinh3() {
        int i,j;
        for( i = 5; i >= 1; i--)
        {
            System.out.print("|");
        
            //in khoảng trống
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("/");
            
            //in dấu . lấy sl + 2 * dòng = 4+2 * dòng
            for (j=1;j<=(10-2*i);j++)
            {
                System.out.print(".");
            }
            System.out.print("\\");

            //in khoang trống
            for(j = 1; j <=(i-1); j++)
            {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
    }
}
