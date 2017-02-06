package LinkList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDumps2_1 {
	public static void main(String [] args){
		//System.out.println(removeDups());
	}
	
	public static List<Integer> removeDups(List<Integer> list){
		
		Map<Integer, Integer> set = new HashMap<Integer, Integer>();	
		
		for (int i=0;i<list.size();i++){
			if (set.get(list.get(i))!=1){
				set.put(list.get(i), 1);
			} else{
				list.remove(i);
			}
		}
		return list;
	}
}
