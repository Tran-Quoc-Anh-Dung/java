public class CH3_thuchanh2 {
    public static void main(String[] args) {
        hinh2();
    }
    public static void hinh2() {
        System.out.print("*");
        writespace(3);
        System.out.print("*");
        
        System.out.println();
        
        System.out.print("!");
        writespace(5);
        System.out.print("!");
        
        System.out.println();
        
        System.out.print("'");
        writespace(8);
        System.out.print("'");

        System.out.println();
        System.out.print("<");
        writespace(10);
        System.out.print(">");
    }

    
    public static void writespace(int number) {
        for(int i=1; i <= number; i++){
            System.out.print(" ");
        }
    }
}


