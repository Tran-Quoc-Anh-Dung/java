public class CH4_thuchanh11 {
    public static void main(String[] args) {
        int rows = 11;

        for (int i = 0; i < rows; i++) {
            int number = 1;

            // in khoảng trắng
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.printf("%2s"," "); //%2s dùng để chỉnh độ rộng 
            }

            // in các số trong tam giác
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }

            System.out.println();

        }
    }
}
