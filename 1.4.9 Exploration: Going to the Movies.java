import java.util.Scanner;

public class MovieBudget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double budget = 40.00;
        
        System.out.println("What movie are you going to see?");
        String movie = input.nextLine();
        
        System.out.println("How much is a ticket?");
        double ticketPrice = input.nextDouble();
        
        System.out.println("How many tickets will you buy?");
        int ticketAmt = input.nextInt();
        
        double totalTicketPrice = ticketPrice * ticketAmt;
        input.nextLine();
        
        System.out.println("What snack will you get?");
        String snack = input.nextLine();
        
        System.out.println("How much is the snack?");
        double snackPrice = input.nextDouble();
        
        double total = totalTicketPrice + snackPrice;
        double checkBudget = budget - total;
        
        System.out.print("Total price for your movie night: $");
        System.out.println(total);
        
        System.out.print("Budget Check: $");
        System.out.println(checkBudget);
    }
}
