import java.util.Scanner;

class tax {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    System.out.println("Calculating Income Tax");
    System.out.println();
    System.out.println("Total income for the year: $");
    int income = kin.nextInt();
    
    
    if (income >= 0 && income < 9525){
      double tax = income * 0.1;
      System.out.println("Tax to be paid: $"+tax);
    }
    
    else if(income >= 9525 && income < 38700){
      double excess = income - 9525;
      double tax02 = excess * 0.12;
      double tax002 = tax02 + 952.5;
      System.out.println("Tax to be paid: $"+tax002);
      
		}
    
    else if(income >= 38700 && income < 82500){
     double excess2 = income - 38700;
     double tax3 = excess2 * 0.22;
     double tax03 = tax3 + 4453.50;
     System.out.println("Tax to be paid: $"+tax03);
		}
		
		else if(income >= 82500 && income < 157500){
		  double excess3 = income - 82500;
		  double tax4 = excess3 * .24;
		  double tax04 = tax4 + 14089.50;
		  System.out.println("Tax to be paid: $"+tax04);
		}
		
		else if(income >= 157500 && income < 200000){
		  double excess4 = income - 157500;
		  double tax5 = excess4 * .32;
		  double tax05 = tax5 + 32089.50;
		  System.out.println("Tax to be paid: $"+tax05);
		}
		
		else if(income >= 200000 && income < 500000){
		  double excess5 = income - 200000;
		  double tax6 = excess5 * .35;
		  double tax06 = tax6 + 45689.50;
		  System.out.println("Tax to be paid: $"+tax06);
		}
		
		else if(income >= 500000){
		  double excess6 = income - 500000;
		  double tax7 = excess6 * .37;
		  double tax07 = tax7 + 150689.50;
		  System.out.println("Tax to be paid: $"+tax07);
		}
		
    
  }
}