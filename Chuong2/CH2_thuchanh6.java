public class CH2_thuchanh6 {
    public static void main(String[] args) {
        int i,j;
        for( i = 1; i <= 5; i++)
        {
            for(j = 1; j <=(i-1); j++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=(11-2*i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for( i = 5; i >= 1; i--)
        {
            for(j = 1; j <=(i-1); j++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=(11-2*i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

