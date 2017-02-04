
public class ArrayString1_2 {

	public static void main(String [] args){
		System.out.println(checkPermutationArr("aa", "ab"));
	}
	
	public static String sort(String s){
		char [] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	public static boolean checkPermutation(String s1, String s2){
		if(s1.length() != s2.length())
			return false;
		
		return (sort(s1).equals(sort(s2)));
	}
	
	public static boolean checkPermutationArr(String s1, String s2){
		if(s1.length() != s2.length())
			return false;
		//s1 
		int[] letters = new int [256];
		for(int i=0;i<s1.length();i++){
			int val = s1.charAt(i);
			letters[val] ++;
		}

		//check s2
		for(int i=0;i<s2.length();i++){
			int val = s2.charAt(i);
			letters[val] -- ;
			if(letters[val] <0)
				return false;
		}
		 
		return true;

	}
}




