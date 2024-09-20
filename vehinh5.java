public class vehinh5{
    public static void main(String[] args) {
        
        hinh1();
        System.out.println();
        hinh2();
        System.out.println();
        hinh3();
    }

    public static void hinh1()
    {
        ve1();
        
    }
    
    public static void hinh2()
    {
        ve1();
        System.out.println("* | | | | | *");
        System.out.println("*************");
        ve1();
        

    }

    public static void hinh3()
    {
        ve1();
        System.out.println("    *****");
        ve2();
        ve3();


    }

    public static void ve1()
    {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
        
    }

    public static void ve2()
    {
        System.out.println("* | | | | | *");
        System.out.println("* | | | | | *");
    }

    public static void ve3()
    {
        System.out.println("    *****");

        System.out.println("    *****");
    }

    
}