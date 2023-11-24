package testUtils;

public class GetEnclosingMethodName {

	public static String getMethodName() {
		return Thread.currentThread().getStackTrace()[1].getMethodName();
	
	}}
