import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestNG;

/**
 * 
 */

/**
 * @author KANNA
 *
 */
public class ItestListenerTest extends TestNG implements ITestListener {
	 public void onFinish(ITestContext Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onStart(ITestContext Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    		
	    public void onTestFailure(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("The name of the testcase failed is :"+Result.getName());	
	    }		

	   		
	    public void onTestSkipped(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    		
	    public void onTestStart(ITestResult Result) {					
	        // TODO Auto-generated method stub			
	    	System.out.println(Result.getName()+" test case started");	
	        		
	    }		

	    		
	    public void onTestSuccess(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("The name of the testcase passed is :"+Result.getName());
	        		
	    }	
		
	}


