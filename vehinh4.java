public class vehinh4{
    public static void main(String[] args) {
        kimcuong();
        
        daux();
        
        tenlua();
        
    }
        
        public static void kimcuong()
        {
            ve1(); 
            ve2();
        }

        public static void daux()
        {
            ve2();
            ve1();
        }

        public static void tenlua()
        {
            ve1();
            ve3();
            System.out.println("|  Viet|");
            System.out.println("|   Nam|");
            ve3();
            ve1();
        }

        public static void ve1()
        {
            System.out.println("   /\\");
            System.out.println("  /  \\");
            System.out.println(" /    \\");
        }

        public static void ve2()
        {
            System.out.println(" \\    /");
            System.out.println("  \\  /");
            System.out.println("   \\/");
        }

        public static void ve3()
        {
            System.out.println("+------+");
            System.out.println("|      |");
            System.out.println("|      |");
            System.out.println("+------+");
        }
    }
