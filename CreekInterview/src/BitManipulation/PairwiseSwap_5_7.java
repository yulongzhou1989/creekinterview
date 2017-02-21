package BitManipulation;

public class PairwiseSwap_5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//10101010 1 bit 0xaa, 01010101 1bit 0x55
	public int swapOddEven(int a){
		
		return ((a&0xaaaaaaaa)>>>1) | ((a&0x55555555)<<1);
	}

}
