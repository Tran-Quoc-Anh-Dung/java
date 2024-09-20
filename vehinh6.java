public class vehinh6{
    public static void main(String[] args) {
        
        hinh4();
        System.out.println();
        hinh5();
        System.out.println();
        hinh6();
    }

    public static void hinh4()
    {
        ve1();
        ve2();
        ve2();
        ve3();
        
    }
    
    public static void hinh5()
    {
        ve1();
        System.out.println("|   Stop   |");
        ve2();
        

    }

    public static void hinh6()
    {
        ve1();
        ve3();


    }

    public static void ve1()
    {
        System.out.println("  ________ ");
        System.out.println(" /        \\");
        System.out.println("/          \\");
        
    }

    public static void ve2()
    {
        System.out.println("\\          /");
        System.out.println(" \\________/");
      
    }
    public static void ve3()
    {
       System.out.println("+----------+");
    }

    
    
}