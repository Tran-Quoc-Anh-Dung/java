public class vehinh4 {
    public static void main(String[] args) {
        drawDiamond();
        System.out.println();
        drawX();
        System.out.println();
        drawRocket();
        System.out.println();
    }
    public static void drawDiamond() {
        drawCone();
        drawV();
    }
    public static void drawX() {
        drawV();
        drawCone();
    }
    public static void drawRocket() {
        drawCone();
        drawBox();
        System.out.println("  |  Viet|");
        System.out.println("  |   Nam|");
        drawBox();
        drawCone();
    }

    public static void drawCone() {
        System.out.println("     /\\");
        System.out.println("    /  \\");
        System.out.println("   /    \\");
    }
    public static void drawV() {
        System.out.println("   \\    /");
        System.out.println("    \\  /");
        System.out.println("     \\/");
    }
    public static void drawBox() {
        System.out.println("  +------+");
        System.out.println("  |      |");
        System.out.println("  |      |");
        System.out.println("  +------+");
    }
    public static void fivehinh() {
        drawDiamond();
        drawX();
        drawRocket();  
    }

}
