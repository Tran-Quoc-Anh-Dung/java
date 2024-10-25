public class th4
{
    public static void main(String[] args) {
        int [][] tamgiac = new int[10][];
        thietlaptamgiac(tamgiac);
        printmatran(tamgiac);
    }

    public static void thietlaptamgiac(int [][] tamgiac)
    {
        for(int i = 0; i < tamgiac.length; i++)
        {
            tamgiac[i] = new int [i+1]; //thiet lap gia tri mang
            tamgiac[i][0] = 1; // gia tri dau cua moi mang
            tamgiac[i][i] =1; //gia trij cuoi cua moi mang
            //quy luat tao hang i dua vao gia tri i
            for(int j=1; j<i; j++)
            {
                tamgiac[i][j] = tamgiac[i-1][j-1] + tamgiac[i-1][j];
            }
         }
    }

    public static void printmatran(int [][] tamgiac)
    {
        for(int i=0; i<tamgiac.length; i++)
        {
            //in lan luot gia tri tai hang j
            for(int j=0; j< tamgiac[i].length; j++)
            {
                System.out.print(tamgiac[i][j] + " ");
            }
            System.out.println();
        }
    }
}