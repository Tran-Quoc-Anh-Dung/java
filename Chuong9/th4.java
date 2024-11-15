import java.util.ArrayList;
import java.util.Collections;

public class th4{
    public static void main(String[] args) {
        // tạo mảng
        ArrayList<String> words = new ArrayList<>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");

        //Danh sách ban đầu
        System.out.println("Danh sach ban dau la: " + words);

        //Sắp xếp A -> Z
        Collections.sort(words);

        //hiển thị danh sách sau khi sắp xếp
        System.out.println("Danh sach sau khi sap xep la: " + words);
    }
}