public class btvn2 {
    public static void main(String[] args) {
        int i,j;
        for(i = 5; i >= 1; i--){
            int numbers = 11-2*i;
            //so lan in "-"; j = 0 thì sl in giữ nguyên j = 1 thì giảm 1
            for(j = 0; j <= (i-1); j++){
                System.out.print("-");
            }

            for(j = 1; j <= (11-2*i); j++){
                System.out.print(numbers); // thứ tự(11-2*i) từ trên xuống, (2 * i - 1) từ dưới lên 
            }

            for(j = 0; j <= (i-1); j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
