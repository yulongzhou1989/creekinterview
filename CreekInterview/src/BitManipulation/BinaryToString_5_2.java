package BitManipulation;

public class BinaryToString_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BinaryToString(0.8125));
		System.out.println(BinaryToString(0.085));
	}
	
	//double between 0 to 1
	public static String BinaryToString(double num){
		if (num>=1 || num<=0) return "ERROR";
		StringBuilder sb = new StringBuilder();
		sb.append(".");
		while(num >0){
			if (sb.length()>=32) return "ERROR";
			double r = num*2;
			if (r>=1) {
				sb.append(1);
				num = r-1;
			} else{
				sb.append(0);
				num = r;
			}
		}
		return String.valueOf(sb);
	}
	
	
	//float java bit representation 
	//http://introcs.cs.princeton.edu/java/91float/
	

}
