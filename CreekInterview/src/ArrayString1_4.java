
public class ArrayString1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindromePermutation("adadac"));
	}
	
	
	public static boolean palindromePermutation(String  s){

		//number of the same char could be divided by 2
		s = s.toLowerCase();
		int [] arr = new int ['z'-'a' + 1];
		int countOdd = 0;
		
		for(int i = 0; i<s.length();i++){
			int val = getChar(s.charAt(i));
			if(val!=-1){
				arr[val] ++;
				if(arr[val] % 2 == 1)
					countOdd ++;
				else
					countOdd -- ;
			}

		}
		
		return countOdd <= 1;
	}

	public static int getChar(Character c){

		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val =  Character.getNumericValue(c);
		if(a<=val &&z>=val){
			return val - a;
		}
		else 
			return -1;
	}

}
