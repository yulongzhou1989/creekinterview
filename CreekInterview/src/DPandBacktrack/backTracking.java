package DPandBacktrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class backTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3};
		
		System.out.println(permutate(nums));
	}
	
	public static List<List<Integer>> subsets (int [] nums){
		List<List<Integer>> list = new ArrayList<> ();
		Arrays.sort(nums);
		backTrackSubsets (list, new ArrayList<>(), nums, 0);
		return list;
	}
	
	public static void backTrackSubsets(List<List<Integer>> list, List<Integer> templist, int [] nums, int start){
		list.add(new ArrayList<>(templist));
		
		for (int i=start; i<nums.length; i++){
			templist.add(nums[i]);
			backTrackSubsets(list, templist, nums, i+1);
			templist.remove(templist.size()-1);
		}
	}
	
	public static List<List<Integer>> permutate(int [] nums){
		List<List<Integer>> list = new ArrayList<> ();
		//Arrays.sort(nums);
		backTrackPermutate (list, new ArrayList<>(), nums);
		return list;
	}

	public static void backTrackPermutate(List<List<Integer>> list, List<Integer> tempList
			, int [] nums){
		if (tempList.size() == nums.length){
			list.add(new ArrayList<>(tempList));
		}
		
		for (int i=0; i<nums.length;i++){
			if (tempList.contains(nums[i])) continue;
			tempList.add(nums[i]);
			backTrackPermutate(list, tempList, nums);
			tempList.remove(tempList.size()-1);
		}
	}
}
