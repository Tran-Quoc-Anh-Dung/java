public class CH2_thuchanh7 {
    public static void main(String[] args) {
        int i,j;
        System.out.println("+---------+");
        for( i = 1; i <= 5; i++)
        {
            System.out.print("|");
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }

            for (j=1;j<=(11-2*i);j++)
            {
                System.out.print("*");
            }

            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
        System.out.println("+---------+");

        for( i = 5; i >= 1; i--)
        {
            System.out.print("|");
            for(j = 1; j <=(i-1); j++)
            {
                System.out.print(" ");
            }

            for (j=1;j<=(11-2*i);j++)
            {
                System.out.print("*");
            }

            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
        System.out.println("+---------+");
    }
}
