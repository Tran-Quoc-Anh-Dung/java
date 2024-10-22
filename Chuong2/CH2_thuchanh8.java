public class CH2_thuchanh8 {
    public static void main(String[] args) {
        line();
        tophalf();
        bottomhalf();
        line();

    }
    public static void line() {
        System.out.println("+------+");
    }
    public static void tophalf() {
        int i,j; // i là dòng , j là sl dấu 
        for( i = 1; i <= 3; i++)
        {
            
            System.out.print("|");

            //in khoảng trống
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            
            //in dấu . lấy sl + 2 * dòng = 4+2 * dòng
            for (j=1;j<=(6-2*i);j++)
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

    public static void bottomhalf(){
        int i,j;
        for( i = 3; i >= 1; i--) // in ngược lại
        {
            System.out.print("|");
        
            //in khoảng trống
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("/");
            
            //in dấu . lấy sl + 2 * dòng = 4+2 * dòng
            for (j=1;j<=(6-2*i);j++)
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

