import java.io.*;
import java.util.*;

public class th5{
    public static void main(String[] args) {
        try {
            // tạo mảng
            ArrayList<String> ungvien = new ArrayList<>();
            ArrayList<String> phieubau = new ArrayList<>();
            int [] demphieu = new int[4]; // đếm phiếu A B C D

            // đọc file
            Scanner input = new Scanner(new File("phieu.txt"));
            while(input.hasNext()){
                String name = input.next();
                phieubau.add(name); //Lưu phiếu bầu vào danh sách

                //loại bỏ các phần tử lặp lại
                if(!ungvien.contains(name)){
                    ungvien.add(name);
                }
            }
            input.close();

            //sắp xếp ứng viên
            Collections.sort(ungvien);

            //đếm phiếu
            for(String vote : phieubau){
                for(int i=0; i<vote.length(); i++){
                    char candidate = vote.charAt(i);
                    int index = ungvien.indexOf(String.valueOf(candidate)); // tìm vị trí của ứng viên trong danh sách
                    if(index != -1){
                        demphieu[index] ++;
                    }
                }
            }

            // tính tổng phiếu
            int tongphieu = phieubau.size();

            // tìm người win
            int win = demphieu[0];
            String winner = ungvien.get(0);
            for(int i = 1; i<demphieu.length; i++){
                if(demphieu[i] > win){
                win = demphieu[i];
                winner = ungvien.get(i);
            }
        } 
            //hiển thị kết quả
            System.out.println("Ung vien | So phieu | ti le bau(%)");
            for(int i=0; i< ungvien.size(); i++){
                double percentage = win > 0 ? (double) demphieu[i] / tongphieu * 100 : 0.0;
                System.out.printf("%-8s | %-8d | %.2f%%\n", ungvien.get(i), demphieu[i],percentage);
            }
            System.out.println("Nguoi chien thang la: " + winner);
        }
        catch(FileNotFoundException e){
            System.out.println("Khong tim thay file.");
        }
    }
   
}