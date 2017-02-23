package BitManipulation;

public class test_longest_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largest_power(101));
	}
	
	
	static long largest_power(long N) {
	    //changing all right side bits to 1.
	    N = N | (N>>1);
	    N = N | (N>>2);
	    N = N | (N>>4);
	    N = N | (N>>8);
	    N = N | (N>>16);
	    return (N+1)>>1;
		//return N&(N-1);
	}

}
