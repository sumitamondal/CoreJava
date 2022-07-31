package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green World";
	     int count = 0;
	     for(int index=0;index<str.length();index++) {
	    	 char ch =str.charAt(index);
	    	 
	    	 switch(ch) {
	    	 
	    	     case 'a':
	    	     case 'A':
	    	     case 'e':
	    	     case 'E':
	    	     case 'i':
	    	     case 'I':
	    	     case 'o':
	    	     case 'O':
	    	     case 'u':
	    	     case 'U':
	    	    	    	    	 
	    	    	 count++;
	    	    	 break;
	    	 } 
	    	    	 
	     }
	     
	     System.out.println("The total vowels are " + count);
	}

}
