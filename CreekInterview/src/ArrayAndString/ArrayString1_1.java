package ArrayAndString;
import java.util.HashMap;
import java.util.Map;

public class ArrayString1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IsUniqueInt("aba"));
	}
	
	public static boolean IsUnique(String s){
		
		//put s into HashMap
		//check exist characters if find the same char, return false
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++){
			Integer value = hm.get(s.charAt(i));
			
			if(value!=null && value == 1){
				return false;
			}
			
			hm.put(s.charAt(i),1);
		}
		
		//insert all s, return true
		return true;
	}
	
	
	public static boolean IsUniqueArray(String s){
		
		//ASCII 128, ASCII extend 256, UNICODE INT_MAX
		
		if(s.length()>256) return false;
		
		//put s into HashMap
		//check exist characters if find the same char, return false
		Boolean [] arr = new Boolean [256];
		
		for(int i=0;i<s.length();i++){
			
			int val = s.charAt(i);
			if(arr[val]!=null && arr[val]){
				return false;
			}
			arr[val] = true;
		}
		
		//insert all s, return true
		return true;
	}

	
	public static boolean IsUniqueInt(String s){
		int checker = 0;
		for(int i=0;i<s.length();i++){
			int val = s.charAt(i);
			if((checker & (1<<val)) >0){
				return false;
			}
			checker |= 1<< val;
		}

		return true;
	}
}
