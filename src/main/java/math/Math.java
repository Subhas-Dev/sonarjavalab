package math;

/**
 * Math class
 */
public class Math {
	
    public static int add(int a, int b) throws Exception {
    
        return a + b;  
    }

    public static int div(int a, int b) throws Exception {
    	if (b == 0) {
    		throw new UnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;  
    }

     public static int mul(int a, int b) throws Exception {
    	if (b == 0) {
    		throw new UnsupportedOperationException("Can't multiply by zero!");
    	}
        return a * b;  
    }
}
