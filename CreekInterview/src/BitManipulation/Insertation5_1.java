package BitManipulation;

public class Insertation5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int insertation(int N, int M, int i, int j){
		int  left = ~0<<(j+1);//11100000
		int right = 1<<i - 1;//00000011
		int mask = left | right;
		
		int nClear = N & mask;
		int mShift = M <<i;
		return nClear | mShift;
	}

}
