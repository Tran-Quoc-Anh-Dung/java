public class baitap2 {
    public static void main(String[] args) {
        hinh1();
        System.out.println();
        hinhhai();
        System.out.println();
        hinhba();
        System.out.println();

    }
    public static void hinhhai() {
       hinh1();
       hinh2();
       hinh5();
       hinh1();
    }
    public static void hinhba() {
        hinh1();
        hinh3();
        hinh2();
        hinh2();
        hinh3();
        hinh3();
     }


    public static void hinh1() {
        System.out.println("     *****");
        System.out.println("   *********");
        System.out.println(" ************");
    }
    public static void hinh2() {
        System.out.println(" *| | | | | |*"); 
        
    }
    public static void hinh3() {
        System.out.println("     *****"); 
    }
    public static void hinh4() {
        System.out.println("   *********");
    }
    public static void hinh5() {
        System.out.println(" ************"); 
    }
   
}
