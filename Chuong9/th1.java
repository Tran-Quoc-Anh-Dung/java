import java.util.ArrayList;

public class th1{
    public static void main(String[] args) {
        // 1) tạo mảng
        ArrayList<String> names = new ArrayList<>();
        names.add("Hoa");
        names.add("Mai");
        names.add("Dung");
        names.add("Hoang");
        names.add("Hai");
        names.add("Vinh");
        names.add("Tu");
        names.add("Bao");
        names.add("Anh");

        //hiển thị mảng ban đầu
        System.out.println("Mang ban dau la: " + names);

        // 2) thêm tên Tung vao giua Dung,Hoang
        names.add(3,"Tung");
        System.out.println("Mang sau khi them Tung: " + names);

        // 3) thêm Oanh vào cuối dãy
        names.add("Oanh");
        System.out.println("Mang sau khi them Oanh : " + names);

        // 4) Hiển thị giá trị tại vị trí 7
        System.out.println("Gia tri tai vi tri thu 7 la: " + names.get(6));

        // 5) Hiển thị chiều dài mảng
        System.out.println("Chieu dai cua mang la: " + names.size());

        // 6) Xóa tên tại vị trí 3 và 6
        names.remove(3);
        names.remove(5);
        System.out.println("Mang sau khi xoa vi tri 3 va 6 la: " + names);

        // 7) Thay vị trí số 2 thành tên Toang
        names.set(2,"Toang");
        System.out.println("Mang sau khi thay doi ten vi tri so 2 la: " + names);

        // 8) hiển thị chiều dài của mảng
        System.out.println("Chieu dai cua mang la : " + names.size());

    }
}