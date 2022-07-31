package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=2;
		
		while(num<=10) {
			
			if(num==6) {
			 num = num + 2;
			 continue;
			}else {
			System.out.println(num);
			}
			num = num + 2;
		}
		
		System.out.println("After while loop");
		
		//For loop
		for(int index=1;index<=10;index++) {  //For loop
			
			if(num==6) {
				continue;
			}
			System.out.println(index);
				
		}
		System.out.println("After For loop");
		
int[] array1 = {10,20,30,40,50,60};
        
        for(int num1:array1) {             //For each loop
            
            System.out.println(num1);
        }
        for(int index=0;index<array1.length;index++) {    //using For each loop
        	System.out.println(array1[index]);
        }
	}
	

}
