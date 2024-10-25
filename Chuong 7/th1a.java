public class th1a{
    public static void main(String[] args) {
        th1 p = new th1();
        p.x = 10;
        p.y = 5;

        System.out.println("Gia tri truoc khi dich chuyen x: " + p.x + " y: " + p.y);
        p.dich(2,5);
        System.out.println("Gia tri sau khi dich chuyen x: " + p.x + " y: " + p.y);
        System.out.println("Khoang cach den goc toa do: " + p.khoangcach());
    }
}