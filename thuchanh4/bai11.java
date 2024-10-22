public class bai11
{
    public static void main(String[] args) {
        int n=10; //so hang cua tam giac

        //tao mang
        int[][] triangle = new int[n+1][];

        //tao tam giac
        for(int i=0; i<=n; i++)
        {
            triangle[i] = new int[n+1];
            triangle[i][0] = triangle[i][i] = 1; //gan phan tu dau va cuoi la 1

            // tinh gia tri o giua
            for(int j=1; j<i; j++)
            {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]; 
            }
        }

        // in tam giac voi chieu dai 4
        for(int i=0; i<=n; i++)
        {
            //in khoang trang ben trai
            for(int j=n-i; j>0; j--)
            {
                System.out.print("    ");
            }

            for(int j=0; j<=i; j++)
            {
                System.out.printf("%4d", triangle[i][j]);
            }
            System.out.println();

            //in khoang trang ben phai
            for(int j=0; j<n-1; j++)
            {
                System.out.print("    ");
            }
            System.out.println();

        }
    }
}