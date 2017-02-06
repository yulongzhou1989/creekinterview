package ArrayAndString;

public class ArrayString1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(oneEditWay("pale","bale"));
	}
	
	public static boolean oneWay(String s1, String s2){
		
		//put s1 to int array
		int [] arr = new int [256];
		
		for(int i=0;i<s1.length();i++){
			int val = s1.charAt(i);
			arr[val] ++;
		}
		//check difference between array and s2
		for(int i=0;i<s2.length();i++){
			int val = s2.charAt(i);
			arr[val] --;
		}
		
		int diff_S1 = 0;
		int diff_S2 = 0;
		
		for(int i=0;i<256;i++){
			//diff+=arr[i];
			if(arr[i]>=0)
				diff_S1 += arr[i];
			else if(arr[i]<0)
				diff_S2 += arr[i];
		}
		
		if((diff_S1 == 1 && diff_S2 == 0)
			||(diff_S1 == 0 && diff_S2 == -1)
			||(diff_S1 == 1 && diff_S2 ==-1))
			return true;
		else 
			return false;
			
	}

	public static boolean oneEditWay(String s1, String s2){
		if(s1.length() == s2.length()) 
			return oneEditReplace(s1, s2);
		if(s1.length() + 1 == s2.length())
			return oneEditInsert(s1, s2);
		if(s1.length() == s2.length() + 1)
			return oneEditInsert(s1, s2);
		return false;
	}
	
	public static boolean oneEditReplace(String s1, String s2){
		boolean foundDiff = false;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i))
			{
				if(foundDiff)
					return false;
				foundDiff = true;
			}
		}
		return true;
	}
	
	public static boolean oneEditInsert(String s1, String s2){
		int index1 = 0;
		int index2 = 0;
		while(index1 < s1.length() && index2< s2.length())
		{
			if(s1.charAt(index1) != s2.charAt(index2))
			{
				if(index1!=index2)
					return false;
				index2++;
			}
			else
			{
				index1++;
				index2++;
			}	
		}
		
		return true;
	}
}
