public class bai2
{
    public static void main(String[] args) {
        drawTop();
    }

    public static void drawTop()
    {
            System.out.print("*");
            writeSpaces(3);
            System.out.print("*");
            System.out.println();

            System.out.print("!");
            writeSpaces(5);
            System.out.print("!");
            System.out.println();

            System.out.print("'");
            writeSpaces(8);
            System.out.print("'");
            System.out.println();

            System.out.print("<");
            writeSpaces(10);
            System.out.print(">");
            System.out.println();
         
    }

    public static void writeSpaces(int number)
    {
        for( int i=1; i<=number; i++)
        {
            System.out.print(" ");
        }
        
    }
}