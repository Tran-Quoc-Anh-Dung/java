public class CH2_thuchanh1{
    public static void main(String[] args) {
        double hight;
        double weight;
        double bmi;

        hight=70;
        weight=195;
        bmi= weight/(hight*hight) * 703;

        System.out.println("Gia tri BMI1: ");
        System.out.println(bmi);

        //thuchanh2
        //khoi tao gia tri ban dau
        hight=70;
        weight=195;
        bmi= weight/(hight*hight) * 703;
        
        //hien thi ket qua
        System.out.println("Gia tri BMI 2: ");
        System.out.println(bmi);
        System.out.println();
        
        //dùng nối chuỗi
        System.out.println("Gia tri BMI 2: " + bmi);

        System.out.println("5 " + "Hello " + ( 5+8));
    }
}