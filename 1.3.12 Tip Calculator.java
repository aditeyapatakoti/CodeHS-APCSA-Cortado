public class TipCalculator
{
    public static void main(String[] args)
    {
        double meal = 25.99;
        double appetizer = 6.50;
        double drink = 3.99;
        
        // Create variables to store the different tip options
        double tip1 = 0.15;
        double tip2 = 0.2; 
        double tip3 = 0.25;
        
        // Print out the total and different amounts for each tip option
        double total = meal+appetizer+drink;
        System.out.println("Total cost of the meal: " + total);
        System.out.println("15% tip amount: " + total*tip1);
        System.out.println("20% tip amount: " + total*tip2);
        System.out.println("25% tip amount: " + total*tip3);
        
    }
}
