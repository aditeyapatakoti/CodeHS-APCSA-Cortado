public class TempConversion
{
    public static void main(String[] args)
    {
        int intTempF = 70;
        
        // Conversion #1: 5 / 9 * (intTempF - 32)
        System.out.println(5.0 / 9 * (intTempF - 32));
        
        // Conversion #2: 5.0 / 9 * (intTempF - 32)
        System.out.println(5.0 / 9 * (intTempF - 32));
        
        // Uses a double value for the initial Fahrenheit temperature
        double doubleTempF = 70;

        // Conversion #3: 5 / 9 * (doubleTempF - 32)
        System.out.println(5.0 / 9 * (doubleTempF - 32));
        
        // Conversion #4: (doubleTempF - 32) * 5 / 9
        System.out.println((doubleTempF - 32) * 5.0 / 9);
    }
}
