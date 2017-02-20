package BitManipulation;

import java.util.ArrayList;

public class FlipBitToWin_5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(flipBit(13));
		System.out.println(flipBit(Integer.MAX_VALUE));
	}
	
	//solution 1 with O(b) duplicate and O(b) memory, b length of sequence.
	public static int longestSequence(int num){
		if (num == -1) return Integer.BYTES*8;
		ArrayList<Integer> sequence = getSequence(num);
		return findLongest(sequence);
	}
	
	/**
	 * Return a list of sizes of the sequences. The sequence starts off with the number of 0s 
	 * and then alter with the counts of each value.
	 */
	public static ArrayList<Integer> getSequence(int num){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int searchFor = 0;
		int count = 0;
		
		for (int i=0;i<Integer.BYTES*8;i++){
			//flip
			if ((num&1)!= searchFor){
				result.add(count);
				searchFor = num &1;
				count = 0;
			}
			count++;
			num >>>= 1;
		}
		
		return result;
	}
	
	/**
	 * find longest from 0s and 1s sequence
	 */
	public static int findLongest(ArrayList<Integer> seq){
		int maxSeq = 1;
		
		for (int i=0; i<seq.size(); i+=2){
			int leftSeq = i>=1? seq.get(i-1):0;
			int rightSeq = i<seq.size()-1?seq.get(i+1):0;
			int currentZeros = seq.get(i);
			int len=0;
			if (currentZeros == 1){
				len = leftSeq + rightSeq + 1;
			}else if(currentZeros>1) {
				len = 1 + Math.max(leftSeq, rightSeq);
			} else if (currentZeros == 0){
				len = Math.max(leftSeq, rightSeq);
			}
			maxSeq = Math.max(len, maxSeq);
		}
		
		return maxSeq;
	}
	
	//solution 2:O(b) time, O(1) memory
	public static int flipBit(int a){
		if (a == -1) return Integer.BYTES*8;
		
		int currentLength = 0;
		int previousLength = 0;
		int maxLength = 1;
		
		while(a>0){
			if ((a&1) == 1){
				currentLength++;
			} else if ((a&1) == 0){
				previousLength = ((a&2) == 0)?0:currentLength;
				currentLength = 0;
			}
			maxLength = Math.max(currentLength+previousLength+1, maxLength);
			a >>>=1;
		}
		return maxLength;
	}
}
