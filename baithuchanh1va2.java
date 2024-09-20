public class baithuchanh1va2{
    public static void main(String[] args) {
        
        //khai báo biến
        double height;
        double weight;
        double bmi;

        //tính toán bmi

            // gán dữ liệu
            height = 70;
            weight = 195;
            bmi = weight / (height * height) * 703;

        // hien thi ket qua 1
        System.out.println("Gia tri BMI: ");
        System.out.println(bmi);

        //khoi tao gia tri ban dau
        double height2 = 70;
        double weight2 = 195;
        double bmi2 = weight2 / (height2 * height2) * 703;

        //hien thi ket qua 2
        System.out.println("Gia tri BMI2: ");
        System.out.println(bmi2);
        System.out.println();
        
        // dùng nối chuỗi
        System.out.println("Gia tri BMI 2: " + bmi2);
        System.out.println(5  + " hello " +  (7+6));

    }
}