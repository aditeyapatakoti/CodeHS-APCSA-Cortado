public class VariableSwitch
{
    public static void main(String[] args)
    {
        String one = "Value one";
        String two = "Value two";
        
        System.out.println("Initial value of One: ");
        System.out.println(one);
        System.out.println("Initial value of Two: ");
        System.out.println(two);
        System.out.println();
        
        String temp = one;
        one = two;
        two = temp;
        
        System.out.println("Swapped value of One: ");
        System.out.println(one);
        System.out.println("Swapped value of Two: ");
        System.out.println(two);
        System.out.println("----------------------------");
    }
}
