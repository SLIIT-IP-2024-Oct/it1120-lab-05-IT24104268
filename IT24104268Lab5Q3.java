import java.util.Scanner;

public class IT24104268Lab5Q3 {
    
    
    static final int ROOM_CHARGE_PER_DAY = 48000;
    static final int DISCOUNT_3_4_DAYS = 10;
    static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the start date of reservation (1 to 31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter the end date of reservation (1 to 31): ");
        int endDate = scanner.nextInt();
        
      
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;  
        }
        
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;  
        }

        
        int numberOfDays = endDate - startDate;

        
        if (numberOfDays < 3) {
            System.out.println("No discount applied.");
            System.out.println("Number of days reserved: " + numberOfDays);
            System.out.println("Total amount to be paid: Rs " + (ROOM_CHARGE_PER_DAY * numberOfDays));
        } else {
            
            double discount = 0;
            if (numberOfDays <= 4) {
                discount = DISCOUNT_3_4_DAYS;
            } else {
                discount = DISCOUNT_5_OR_MORE_DAYS;
            }
            
            
            double totalAmount = ROOM_CHARGE_PER_DAY * numberOfDays;
            double discountAmount = totalAmount * discount / 100;
            double finalAmount = totalAmount - discountAmount;

            
            System.out.println("Number of days reserved: " + numberOfDays);
            System.out.println("Discount applied: " + discount + "%");
            System.out.println("Total amount to be paid: Rs " + finalAmount);
        }

        scanner.close();
    }
}
