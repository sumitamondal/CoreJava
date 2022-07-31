package test;

public class ExceptionExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {3,4,5};
		int num = 10;
		
		try {
			int res = num/0;
			System.out.println(array[5]);
			
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside exception");
		}catch(java.lang.ArithmeticException e) {
			System.out.println("Inside Arithmatic exception");
		}finally {
			System.out.println("Inside finally");
		}
		
		
     System.out.println("After exception");
	}

}
