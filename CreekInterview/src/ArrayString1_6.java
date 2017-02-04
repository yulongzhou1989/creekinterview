
public class ArrayString1_6 {
	public static void main(String [] Args){
		System.out.println(StringCompression("abb"));
	}
	
	public static String StringCompression(String s){
		
		if(s.length() <= 1)
			return s;
		
		StringBuilder sb = new StringBuilder();
		
		Character currentChar = s.charAt(0);
		sb.append(currentChar);
		int count = 1;
		
		for(int i=1;i<s.length();i++){
			if(s.charAt(i) == currentChar)
				count ++;
			else{
				sb.append(count);
				count = 1;
				currentChar = s.charAt(i);
				sb.append(currentChar);
			}
		}
		
		if (count >1) sb.append(count);
		
		String compressedStr = sb.toString();
		if(compressedStr.length()<s.length())
			return compressedStr;
		else
			return s;
		
	}
}
