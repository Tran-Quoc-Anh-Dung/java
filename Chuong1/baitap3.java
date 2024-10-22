public class baitap3 {
    public static void main(String[] args) {
        hinhmot();
        hinhhai();
        hinhba();
    } 
    public static void hinhmot() {
       hinh1();
       hinh2();
       hinh2();
       hinh3();
    }  
    public static void hinhhai() {
        hinh1();
        System.out.println(" |    STOP    |");
        hinh2();
    }
    public static void hinhba() {
        hinh1();
        hinh3();
    }

    public static void hinh1() {
        System.out.println("   __________");
        System.out.println("  /          \\");
        System.out.println(" /            \\");
    }  
    public static void hinh2() {
        System.out.println(" \\            /");
        System.out.println("  \\__________/");
    }
    public static void hinh3() {
        System.out.println("   +--------+");
    }

}
