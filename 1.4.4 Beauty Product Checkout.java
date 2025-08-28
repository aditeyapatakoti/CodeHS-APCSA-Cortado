public class BeautyCheckout
{
    public static void main(String[] args)
    {
        double bathSoap = 20.99;
        double lotion = 15.99;
        double chapstick = 5.99;
        double discount = 0.25;

        // Create a variable to store the total before the discount
        double initialTotal = bathSoap+lotion+chapstick;
        // Create a variable to store the total amount saved with the discount
        double calc = initialTotal*discount;
        // Create a variable to store the total with the discount applied
        double discountTotal = initialTotal-calc;
        System.out.println("Thanks for supporting Vivid Beauty!");
        System.out.println("Here is a summary of your purchase:\n");
        
        // Print out a summary
        System.out.println("Total before discount is applied: " + initialTotal);
        System.out.println("Amount saved with discount: " + calc);
        System.out.println("Total: " + discountTotal);
    }
}
