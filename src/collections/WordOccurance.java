package collections;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Clean World Green World Love World";
		String[] words= str1.split(" ");
		
		HashMap<String, Integer> map1=new HashMap<String, Integer> ();
		
		for(String word:words) {
			
			if(map1.get(word)==null) {
				map1.put(word, 1);
			}else {
				int OldOccu=map1.get(word);
				map1.put(word, OldOccu+1);
				
			}
		}

		System.out.println(map1);
	}

}
