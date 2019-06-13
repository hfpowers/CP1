//Haley Powers and MaryKate Sullivan
import java.util.Scanner;


class crap {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);

	int Dice1 = (int)(Math.random()* 6)+1;
	int Dice2 = (int)(Math.random()* 6)+1;
	int d1 = Dice1 + Dice2;
		System.out.println("Dice:"+ d1);
	

	if (d1 == 7 || d1 == 11){
      	System.out.println("You win!");
    	}

	else if(d1 == 2 || d1 == 3 || d1 == 12){
      	System.out.println("You lose!");
      	}

	else if(d1 == 4 || d1 == 5 || d1 == 6 || d1 == 8 || d1 == 9 || d1 == 10 || d1 ==12){
        System.out.println("Roll Again!");
    	
        
        int d3 = (int)(Math.random()* 6)+1;
        int d4 = (int)(Math.random()* 6)+1;
        int dd = d3 + d4;
        System.out.println("Dice:"+ dd);
        if (dd == 7){
            System.out.println("You Lose!");
        }
        else{
            while(dd != d1){
            System.out.println("Roll again!");
        
        
            int d5 = (int)(Math.random()* 6)+1;
            int d6 = (int)(Math.random()* 6)+1;
            int di = d5 + d6;
            System.out.println("Dice:"+ di);
                if(dd == di){
                    System.out.println("You win");
                }
                
            }
		
        }
    }
}
}
    
    
