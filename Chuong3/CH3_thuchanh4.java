public class CH3_thuchanh4 {
    public static void main(String[] args) {
        hinh4();
    }
    public static void hinh4() {
            writeChars('*', 10);
            System.out.println();
            
            for (int i = 0; i < 3; i++) {
                writeChars('*', 1);
                writespace(8);
                writeChars('*', 1);
                System.out.println();
            }
            
            writeChars('*', 10);
            System.out.println();
            
    }
    public static void writeChars(char ch, int number) {
        for(int i=1; i<= number; i++){
                System.out.print(ch);
        }
    }
    public static void writespace(int number) {
        for(int i=1; i <= number; i++){
            System.out.print(" ");
        }
    }
}
 



