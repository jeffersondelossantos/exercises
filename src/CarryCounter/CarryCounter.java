public class CarryCounter {
    public static void main(String[] args) {
        System.out.println(numberOfCarryOperations(12, 13));
        System.out.println(numberOfCarryOperations(123422, 1453543));
        System.out.println(numberOfCarryOperations(99, 88));
        System.out.println(numberOfCarryOperations(1565462, 13));
        System.out.println(numberOfCarryOperations(1892, 17453));
        System.out.println(numberOfCarryOperations(212, 34513));
    }

    public static int numberOfCarryOperations(Integer x, Integer y) {
    	int carry = 0;
    	String strX = x.toString();
    	String strY = y.toString();
    	int lengthX = strX.length();
    	int lengthY = strY.length();
    	
    	int remainder = 0;
    	
    	while (lengthX != 0 && lengthY != 0) {
    		int sum = Character.getNumericValue(strX.charAt(lengthX - 1)) + Character.getNumericValue(strY.charAt(lengthY - 1)) + remainder;
    		if (sum > 9) {
    			carry++;
    			remainder = 1;
    		} else {
    			remainder = 0;
    		}
    		
    		lengthX--;
    		lengthY--;
    	}
    	
        return carry;
    }
}
