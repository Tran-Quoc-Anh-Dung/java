public class btvn4 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 7; i++) {
            // In các ký tự "*" ở trên
            for (j = 1; j <= (i-1); j++) {
                System.out.print("**");
            }
            
            // In các ký tự "$" ở đầu mỗi dòng
            for (j = 1; j <= 8 - i; j++) {
                System.out.print("$");
            }
            
            // In các ký tự "*" ở giữa
            for (j = 1; j <= (16-2*i); j++) {
                System.out.print("*");
            }
            
            // In các ký tự "$" ở cuối mỗi dòng
            for (j = 1; j <= 8 - i; j++) {
                System.out.print("$");
            }

            // In các ký tự "*" ở dưới
            for (j = 1; j <= (i-1); j++) {
                System.out.print("**");
            }
            
            System.out.println();
        }
    }
}