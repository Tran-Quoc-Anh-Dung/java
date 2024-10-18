import java.util.Scanner;

public class bai9
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Ban muon mau gi? ");
        String input = console.nextLine().trim().toUpperCase();

        switch(input)
        {
            case "B":
                System.out.println("Ban da chon BLUE.");
                break;

            case "G":
                System.out.println("Ban da chon GREEN.");
                break;

            case "R":
                System.out.println("Ban da chon RED.");
                break;

            default:
                System.out.println("Mau khong xac dinh " +input);
        }

        console.close();

    }
}