public class btvn3 {
    public static void main(String[] args) {
        hinh1();
        hinh2();
        hinh1();
        hinh2();
        hinh1();
    }
    public static void hinh1() {
        System.out.println();
        System.out.println("+===+===+");
    }
    public static void hinh2() {
        int i,j;
        for(i = 1; i <= 3; i++){
            System.out.println();
            for(j = 1; j <= 3; j++){
                System.out.print("|   ");
            }
        System.out.println();
        }
    }
}
