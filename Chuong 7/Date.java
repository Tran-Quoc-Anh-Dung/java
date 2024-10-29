


public class Date
{
    private int year;
    private int month;
    private int day;

    //Khởi tạo đối tượng Date cho trước
    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Hàm cộng số ngày vào Date hiện tại đã cho
    public void addDays(int days)
    {
       
        day += days;

        //Kiểm tra ngày có vượt qua số ngày trong tháng không
        while( day > daysInMonth())
        {
            day -= daysInMonth(); // trừ số ngày trong tháng hiện tại
            month ++;
        }
        //kiểm tra tháng có vượt quá 12 không
        if(month >12)
        {
            month = 1;
            year++;
        }
    }

   

    //Hàm cộng số tuần vào Date hiện tại
    public void addWeeks(int weeks)
    {
        addDays(weeks * 7);
    }

    // Tính số Date hiện tại tới một Date khác
    public int daysTo(Date other)
    {
        Date temp = new Date(year ,month, day);
        int days = 0;

        // tăng giảm ngày của temp tới khi = other
        while(!temp.equals(other))
        {
            if(temp.before(other))
            {
                temp.addDays(1); // ngày hiện tại trước other 1 ngày
                days++;
            }
            else
            {
                temp.addDays(-1); // ngày hiện tại sau other 1 ngày
                days --;
            }
        }

        return days;
    }

    //Hàm trả về ngày 
    public int getDay()
    {
        return day;
    }

    //Hàm trả về tháng
    public int getMonth()
    {
        return month;
    }

    //Hàm trả về năm
    public int getYear()
    {
        return year;
    }

    //Kiểm tra năm nhuận
    public boolean isLeapYear()
    {
        return (year%4 == 0 && year%100 !=0) || (year % 400 == 0);
    }

    //Hàm lấy số ngày trong tháng hiện tại
    private int daysInMonth()
    {
        switch(month)
        {
            case 4: case 6: case 9: case 11:
                return 30; //tháng 4,6,9,11 có 30d
            case 2:
                return isLeapYear() ? 29 : 28; // tháng 2 có 28d, năm nhuận có 29d
            default:
                return 31; // các tháng còn lại có 31d
        }
    }

    //Kiểm tra Date hiện tại có trước Date other không
    private boolean before(Date other)
    {
        if(year != other.year) return year < other.year;
        if(month != other.month) return month < other.month;
        return day < other.day;
    }

    // so sánh Date có bằng Date other
    public boolean equals(Date other)
    {
        return year == other.year && month == other.month && day == other.day;
    }

    // Trả kết quả dạng chuỗi (y,m,d)
    public String toString()
    {
        return year + "/" + (month < 10 ? "0" : "") + month + "/" + (day < 10 ? "0" : "") + day;
    }

    //Hiển thị ngày, tháng, năm
    public void printDay()
    {
        System.out.println("Ngay la: " +day);
    }
    public void printMonth()
    {
        System.out.println("Thang la: " +month);
    }
    public void printYear()
    {
        System.out.println("Nam la: " + year);
    }
    public static void main(String[] args) {
        //Tạo Date  với ngày 2006/07/22
        Date date = new Date(2006, 07, 22);
        System.out.println("Ngay ban dau la: "+ date);

        //Di chuyển số ngày về phía trước 1 ngày
        date.addDays(-1);
        System.out.println("Ngay sau khi tru 1 ngay la: " + date);

        //Di chuyển Date về phía trước 1 tuần
        date.addWeeks(-1);
        System.out.println("Ngay sau khi tru 1 tuan la: " + date);

        //Kiểm tra năm nhuận
        System.out.println("Nam hien tai co phai nam nhuan khong? " + date.isLeapYear());

        date.printDay();
        date.printMonth();
        date.printYear();
    }
}