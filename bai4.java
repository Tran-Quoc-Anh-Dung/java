public class bai4
{
    public static void main(String[] args) {
        drawTop();
    }

    public static void drawTop()
    {   
        writeChars('*',10);
        System.out.println();

        for(int i=0; i<3; i++)
        {
            writeChars('*',1);
            writeSpaces(8);
            writeChars('*',1);
            System.out.println();
        }

        writeChars('*',10);
    }

    

    public static void writeChars(char ch, int number)
    {
        for(int i=1; i<=number; i++)
        {
            System.out.print(ch);
        }
    }

    public static void writeSpaces(int number)
    {
        for( int i=1; i<=number; i++)
        {
            System.out.print(" ");
        }
    }
}