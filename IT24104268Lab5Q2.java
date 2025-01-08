import java.util.Scanner;

public class IT24104268Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of new members you have introduced: ");
        int numNewMembers = scanner.nextInt();
        
        
        if (numNewMembers < 0) {
            System.out.println("Invalid input! Number of new members cannot be negative.");
        } else {
            
            String prize;
            
            switch (numNewMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            
            
            System.out.println("The prize you are entitled to: " + prize);
        }
        
        scanner.close();
    }
}
