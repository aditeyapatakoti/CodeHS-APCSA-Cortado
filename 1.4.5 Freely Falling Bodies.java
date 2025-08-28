public class FallingBodies
{
    public static void main(String[] args)
    {
        final double g = 9.8;
        int t = 23;
        double h = 0.5*g*(t*t);
        double v = g*t;
        System.out.println("The height of the cliff is : " + h);
        System.out.println("The final velocity of the ball is: " + v);
    }
}
