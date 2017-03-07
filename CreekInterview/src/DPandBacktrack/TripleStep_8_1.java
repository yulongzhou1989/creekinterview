package DPandBacktrack;

import java.util.Arrays;

public class TripleStep_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getWays(int n){
		if (n<0) return 0;
		if (n==0) return 1;
		return getWays(n-1)+getWays(n-2)+getWays(n-3);
	}
	
	public int getWays1(int n){
		int [] memo = new int [n+1];
		Arrays.fill(memo, -1);
		return helper1 (n, memo);
	}
	
	public int helper1(int n, int [] memo){
		if (n<0) return 0;
		if (n==0) return 1;
		if (memo[n]!=-1) return memo[n];
		else {
			memo[n] = helper1(n-1, memo) + helper1(n-2, memo) + helper1(n-3, memo);
			return memo[n];
		}
	}
	
	

}
