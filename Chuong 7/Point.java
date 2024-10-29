public class Point
{
   private  int x;
   private  int y;

   //khởi tạo điểm gốc (0,0)
   public Point()
   {
        this.x = 0;
        this.y = 0;
   }

   //khởi tạo tọa độ x và y cho trước
   public Point(int x, int y)
   {
        this.x = x;
        this.y = y;
   }

   //Tính khoảng cách từ điểm cho trước tới gốc tọa độ 
   public double khoangcach()
   {
        return Math.sqrt(x*x + y*y);
   }

   public int getX()
   {
        return x;
   }

   public int getY()
   {
        return y;
   }

   // set giá trị mới cho x và y
   public void setLocation(int x, int y)
   {
        this.x = x;
        this.y = y;
   }

   //Dịch chuyển điểm cho dx và dy
   public void dich(int dx, int dy)
   {
        this.x += dx;
        this.y += dy;
   }

   // hiển thị tọa độ dạng chuỗi
   public String toString()
   {
        return "(" + x + " , " + y +")";
   }

   public static void main(String[] args) {
       //Tạo điểm với tọa độ (5,6)
       Point p = new Point(5,6);
       System.out.println("Diem ban dau la: " + p);

       //Dịch chuyển điểm theo dx=1 và dy=5
       p.dich(1,5);
       System.out.println("Diem sau khi dich chuyen la: " + p);

       //Khoảng cách từ gốc đến tọa độ
       System.out.println("Khoang cach tu goc toa do la: " + p.khoangcach());
   }

}