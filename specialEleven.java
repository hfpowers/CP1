 public class specialEleven{

	 public static void main(String[] args){
		System.out.println(specialEleven(13, true));
	}

	public static boolean specialEleven(int n) {
  	
		if (n % 11 == 0) {
			return true; 
		} 

		if (n % 11 == 1){
			return true;
		} 

		
			return false;
	}
}
	

		