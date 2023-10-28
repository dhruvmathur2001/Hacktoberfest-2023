
class DivideByZeroException extends Exception
{
    public DivideByZeroException(String message)
    {
        super(message);
    }
}
public class CustomisedException 
{
    public static int divide(int dividend, int divisor) throws DivideByZeroException 
    {
        if (divisor == 0) 
        {
            throw new DivideByZeroException("Divisor can't be negative");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) 
    {
        try
        {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } 
        catch (DivideByZeroException e) 
        {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
    
}
