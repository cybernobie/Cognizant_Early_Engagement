import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;
public class Main
{
    public static void main(String args[])
    {
     
	//Uncomment these lines after completing the JUnit Code
        Result result=JUnitCore.runClasses(BookAMovieTest.class);
        
        if(result.getFailureCount()==0)
        {
            System.out.println("No Failures");
        }
        else
        {
            for(Failure failure: result.getFailures())
            
            {
                System.out.println(failure.toString());
            }
        }
        System.out.println("Result "+result.wasSuccessful());
    }
}