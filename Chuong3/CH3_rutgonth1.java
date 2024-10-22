public class CH3_rutgonth1 {
    public static void main(String[] args) {
        drawTop();
    }

    public static void drawTop() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            writespace(line-1);
            System.out.print("\\");
            for (int i = 1; i <= (8 - 2 * line); i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i < line; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            writespace(line-1);
            System.out.println();
        }
    }

    public static void writespace(int number) {
        for(int i=1; i <= number; i++){
            System.out.print(" ");
        }
    }
}
