package BitManipulation;

public class Conversion_5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int bitSwapRequired(int a, int b){
		int count = 0;
		
		for(int i= a^b;i!=0;i = i>>1){
			count+=i&1;
		}
		
		return count;
	}
	//c&(c-1) will clear the lease significant bit in c
	public static int bitSwapRequired1(int a, int b){
		 int count = 0;
		 
		 for(int i=a^b;i!=0;i=i&(i-1)){
			 count ++;
		 }
		 
		 return count;
	}
}
