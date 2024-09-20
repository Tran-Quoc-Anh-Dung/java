public class baithuchanh5{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
        {
            System.out.println("+----------+");
        }
        System.out.println();
        for(int i=1; i<=10; i++)
        {
            System.out.println("*************");
        }

        //vòng lặp trong vòng lặp
        for(int i=1;i<=6;i++)
        {
            for(int j=1; j<=3; j++)
            {
                System.out.print(j+ " ");
            }
        }
    }
}