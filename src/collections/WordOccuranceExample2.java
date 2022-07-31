package collections;

import java.util.Arrays;

public class WordOccuranceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green Green World Love World";
        str = str.toUpperCase();
        String[] arr1 = str.split(" ");
        
        Arrays.sort(arr1); //Sort array.
        
        int count = 0;
        for(int j=0; j<arr1.length; j++) {
            count++;
            if(j < arr1.length-1 && arr1[j].equals(arr1[j+1])) {
                continue;
            }else {
                if(count > 0) {
                    System.out.print("The word "+arr1[j]+" occurs "+count);
                    if(count == 1) {
                        System.out.println(" time.");                    
                    }else if(count > 1) {
                        System.out.println(" times.");                    
                    }
                    count = 0;
                }
                
            }
                
        }

	}

}
