import java.util.Scanner;

public class IceCreamShop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double oneScoop = 2.5;
        
        System.out.println("What flavor ice cream would you like? ");
        String flavor = input.nextLine();
        
        System.out.println("How many scoops would you like?");
        int numScoops = input.nextInt();
        
        double total = numScoops*oneScoop;
        
        System.out.println("Flavor: " + flavor);
        System.out.println("Number of Scoops: " + numScoops);
        System.out.println("Total " + total);
        
        
    }
}
