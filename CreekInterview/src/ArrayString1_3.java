
public class ArrayString1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(URLLify("Mr John Smith    ", 13));
	}
	
	public static String URLLify (String s){
		s = s.trim();
		s = s.replace(" ","%20");
		return s;
	}

	public static String URLLify(String str, Integer len){

		char [] s = str.toCharArray();
		//calculate the number of space
		int spaceNum =  0;
		for(int i = 0;i<len;i++){
			if(s[i] == ' ')
				spaceNum ++;
		}

		//replace space with “%20”
		
		int index = len + spaceNum * 2;

		if(len < s.length) s[len] = '\0';

		for(int i= len-1;i>= 0;i--){
			if(s[i] == ' '){ 
				s[index-1] = '0'; 
				s[index-2] = '2'; 
				s[index-3] = '%';
				index = index -3;
			}
			else {
				s[index-1]=s[i];
				index = index-1;
			}	
		}
		return new String(s);
	}

}
